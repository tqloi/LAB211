package controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import model.Fruit;
import model.FruitList;

/**
 *
 * @author admin
 */
public class Shopping {

    private FruitList fruitList;
    private Hashtable<String, ArrayList<Fruit>> shops;

    public List<Fruit> getFruits() {
        return fruitList.getFruits();
    }

    public Shopping() {
        shops = new Hashtable<>();
        fruitList = new FruitList();
    }

    public void listFruits() {
        System.out.println(String.format("| %-10s | %-16s | %-11s | %-14s | %-12s |", "++ Item ++", "++ Fruit Name ++", "++ Price ++", "++ Quantity ++", "++ Origin ++"));
        for (Fruit f : fruitList.getFruits()) {
            System.out.println(f);
        }
    }

    private void listOrder(List<Fruit> fs) {
        double total = 0;
        for (Fruit f : fs) {
            total += f.getAmount();
            String productDetails = String.format(
                    "Product: %9s | Quantity: %d | Price: %.2f$ | Amount: %.2f$", f.getFruitName(),
                    f.getQuantity(), f.getPrice(), f.getAmount());
            System.out.println(productDetails);
        }
        System.out.println("Total: " + total);
    }

    public void createFruits(Fruit f) {
        int i = getFruits().size() + 1;
        f.setId(i);
        getFruits().add(f);
    }

    public void viewOrder() {
        Enumeration<String> customers = shops.keys();

        while (customers.hasMoreElements()) {
            String customer = customers.nextElement();
            System.out.println("Customer: " + customer);
            List<Fruit> fs = shops.get(customer);
            listOrder(fs);
        }
    }


    public void doShopping(int choice, int quantity, String cusName) {
        if (choice <= 0 || choice > getFruits().size()) {
            System.out.println("Not found item with choice: " + choice);
            return;
        }

        Fruit selectedFruit = fruitList.getFruits().get(choice - 1);

        if (selectedFruit.getQuantity() - quantity < 0) {
            System.out.println("Not enough quantity to buy");
            return;
        }

        // Kiểm tra xem khách hàng đã có đơn hàng trước đó hay chưa
        List<Fruit> customerOrder = shops.get(cusName);

        // Nếu chưa có đơn hàng, tạo một danh sách mới
        if (customerOrder == null) {
            customerOrder = new ArrayList<>();
        }

        // Tạo một đối tượng mới để thêm vào danh sách đơn hàng của khách hàng
        Fruit purchasedFruit = new Fruit(selectedFruit.getId(), selectedFruit.getFruitName(), selectedFruit.getPrice(), quantity, selectedFruit.getOrigin());
        customerOrder.add(purchasedFruit);

        // Cập nhật số lượng trái cây trong danh sách trái cây chính
        selectedFruit.setQuantity(selectedFruit.getQuantity() - quantity);

        // Cập nhật danh sách đơn hàng của khách hàng trong Hashtable
        shops.put(cusName, (ArrayList<Fruit>) customerOrder);

        System.out.println("Buy Successfully!");
    }
}

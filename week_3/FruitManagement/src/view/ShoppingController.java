
package view;

import Library.Input;
import model.Fruit;
import controller.Shopping;

/**
 *
 * @author admin
 */
public class ShoppingController extends Menu{
    
    private Shopping shop;
    private Input ip;

    public ShoppingController() {
        super("Shop fruit", new String[] {"Create Fruit", "View Order", "Shopping(for buyer)", "Exit"});
        shop = new Shopping();
        ip = new Input();
    }
    
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                createFruit();
                break;
            case 2: 
                viewOrder();
                break;
            case 3: 
                shopping();
                break;
            case 4:
                exitMenu();

        }
    }
    
    public void createFruit() {
        String nameF = ip.getString("Enter the name of fruit");
        double price = ip.getDouble("Enter the price of fruit");
        int quantity = ip.getInt("Enter the quantity");
        String origin = ip.getString("Enter the origin");
        
        Fruit f = new Fruit(nameF, price, quantity, origin);
        shop.createFruits(f);
        System.err.println("Create Sucessfully!");
    }
    
    public void viewOrder() {
        shop.viewOrder();
    }
    
    public void shopping() {
        shop.listFruits();
        int choice = ip.getInt("Enter your item choice");
        int quantity = ip.getInt("Enter the quantity of item");
        String cus = ip.getString("Enter the name of customer");
        shop.doShopping(choice, quantity, cus);
    }
    
}

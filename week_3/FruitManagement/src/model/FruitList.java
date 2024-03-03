
package model;

import java.util.ArrayList;
import java.util.List;

public class FruitList {

    private List<Fruit> fruits;

    public FruitList() {
        fruits = new ArrayList<>();
        Fruit f1 = new Fruit(1, "Gomu", 2, 1, "Ni Hon");
        Fruit f2 = new Fruit(2, "Mera", 2, 1, "Tung Cua");
        Fruit f3 = new Fruit(3, "Kiwi", 2, 1, "Viet Nam");

        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);

    }


    public List<Fruit> getFruits() {
        return fruits;
    }
    
    

}

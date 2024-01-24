/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
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

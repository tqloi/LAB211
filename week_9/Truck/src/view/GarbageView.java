package view;

import Library.Input;
import controller.GarbageController;
import model.GarbagePoint;

public class GarbageView {

    private GarbageController gc;
    private Input input;

    public GarbageView() {
        gc = new GarbageController();
        input = new Input();
    }

    public void run() {
        //String s = input.getStringFromInput("Enter the amount of garbage at each station");
        //String[] ip = s.split("\\ ");
        //for (String i : ip) {
        //  gc.addGarbagePoint(new GarbagePoint(Double.parseDouble(i)));

        int x = input.getIntFromInput("Enter number of garbage point");
        for (int i = 1; i <= x; i++) {
            double amount = input.getDoubleFromInput("Garbage point " + i);
            GarbagePoint gp = new GarbagePoint(amount);
            gc.addGarbagePoint(gp);
        }
        System.out.printf("The total cost is %.3f VND\n", gc.calculateCost());
    }
}

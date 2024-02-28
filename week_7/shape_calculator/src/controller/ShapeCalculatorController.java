package controller;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class ShapeCalculatorController {

    private Circle c;
    private Rectangle r;
    private Triangle t;

    public ShapeCalculatorController(Circle c, Rectangle r, Triangle t) {
        this.c = c;
        this.r = r;
        this.t = t;
    }

    public void getResult() {
        System.out.println("-----Rectangle-----");
        r.printResult();
        System.out.println("-----Circle--------");
        c.printResult();
        System.out.println("-----Triangle------");
        t.printResult();
    }
}

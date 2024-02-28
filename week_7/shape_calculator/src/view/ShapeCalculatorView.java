package view;

import Library.Input;
import controller.ShapeCalculatorController;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class ShapeCalculatorView {

    private Input input;
    private ShapeCalculatorController scc;

    public ShapeCalculatorView() {
        input = new Input();
    }

    public void run() {
        System.out.println("=====Calculator Shape Program=====");
        double w = input.getDouble("width of Rectangle");
        double l = input.getDouble("length of Rectangle");
        double r = input.getDouble("radius of Circle");
        double a = input.getDouble("side A of Triangle");
        double b = input.getDouble("side B of Triangle");
        double c = input.getDouble("side C of Triangle");
        Circle circle = new Circle(r);
        Rectangle rectangle = new Rectangle(w,l);
        Triangle triangle = new Triangle(a,b,c);
        scc = new ShapeCalculatorController(circle, rectangle ,triangle);
        scc.getResult();    
    }
}

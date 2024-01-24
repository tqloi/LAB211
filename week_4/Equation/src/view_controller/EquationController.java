package view_controller;

import model.Equation;
import model.Library;

public class EquationController extends Menu {

    private final Equation eq;

    public EquationController() {
        super("========= Equation Program =========", new String[]{"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"});
        eq = new Equation();     
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                calculateSuperlativeEquation ();
                break;
            case 2:
                calculateQuadraticEquation ();
                break;
            case 3:
                exitMenu();
                break;
        }
    }
    
    public void calculateSuperlativeEquation (){
        double a = Library.getDoubleFromInput("A");
        double b = Library.getDoubleFromInput("B");
        eq.Superlative(a, b);
    }
    public void calculateQuadraticEquation (){
        double a = Library.getDoubleFromInput("A");
        double b = Library.getDoubleFromInput("B");
        double c = Library.getDoubleFromInput("C");
        eq.Quadratic(a, b, c);
    }
}

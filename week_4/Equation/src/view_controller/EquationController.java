package view_controller;

import model.Functions;
import model.Library;
import model.Quadratic;
import model.Superlative;

public class EquationController extends Menu {

    private final Functions fs;

    public EquationController() {
        super("========= Equation Program =========", new String[]{"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"});
        fs = new Functions();     
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
        Superlative s = new Superlative(a,b);        
        fs.SuperlativeEquation(s);
    }
    public void calculateQuadraticEquation (){
        double a = Library.getDoubleFromInput("A");
        double b = Library.getDoubleFromInput("B");
        double c = Library.getDoubleFromInput("C");
        Quadratic q = new Quadratic(a,b,c);        
        fs.QuadraticEquation(q);
    }
}

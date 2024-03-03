
package view;

import Library.Input;
import controller.EquationController;
import model.Quadratic;
import model.Superlative;

public class EquationView extends Menu {

    private final EquationController ec;
    private Input ip;

    public EquationView() {
        super("========= Equation Program =========", new String[]{"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"});
        ec = new EquationController(); 
        ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                calculateSuperlativeEquation();
                break;
            case 2:
                calculateQuadraticEquation();
                break;
            case 3:
                exitMenu();
                break;
        }
    }
    
    public void calculateSuperlativeEquation(){
        double a = ip.getDoubleFromInput("A");
        double b = ip.getDoubleFromInput("B");
        Superlative s = new Superlative(a,b);        
        ec.SuperlativeEquation(s);
    }
    public void calculateQuadraticEquation(){
        double a = ip.getDoubleFromInput("A");
        double b = ip.getDoubleFromInput("B");
        double c = ip.getDoubleFromInput("C");
        Quadratic q = new Quadratic(a,b,c);        
        ec.QuadraticEquation(q);
    }
}

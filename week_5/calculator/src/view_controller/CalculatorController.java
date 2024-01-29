package view_controller;

import model.Calculator;
import model.Input;

public class CalculatorController extends Menu {

    private Calculator cal;

    public CalculatorController() {
        super("========= Calculator Program =========", new String[]{"Normal Calculator", "BMI Calculator", "Quit"});
        cal = new Calculator();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                normalCal();
                break;
            case 2:
                bmiCal();
                break;
            case 3:
                exitMenu();
                break;
        }
    }

    public void normalCal() {
        System.out.println("----- Normal Calculator -----");
        Double a = Input.getDouble("number");
        cal.setMemory(a);
        while (true) {
            String operator = Input.getOperator("operator");
            if (operator.equals("=")) {
                break;
            }
            Double b = Input.getDouble("number");
            switch (operator) {
                case "+":
                    cal.addFunction(cal.getMemory(), b);
                    break;
                case "-":
                    cal.subtractFunction(cal.getMemory(), b);
                    break;
                case "*":
                    cal.multipleFunction(cal.getMemory(), b);
                    break;
                case "/":
                    cal.divideFunction(cal.getMemory(), b);
                    break;
                case "^":
                    cal.powFunction(cal.getMemory(), b);
                    break;
            }
            System.out.println(String.format("%-7s%.2f", "Memory: ", cal.getMemory()));
        }
        System.out.println(String.format("%-7s%.2f", "Result: ", cal.getMemory()));
    }

    public void bmiCal() {
        System.out.println("----- BMI Calculator -----");
        int weight = Input.getInt("weight(kg)");
        int height = Input.getInt("height(cm)");
        cal.BMI(weight, height);
        double bmi = cal.getMemory();
        System.out.print("BMI status: ");
        if (bmi < 19) {
            System.out.println("Under-standard");
        } else if (bmi < 25) {
            System.out.println("Standard");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi < 40) {
            System.out.println("Fat - should lose weight");
        } else {
            System.out.println("Very fat - should lose weight immediately");
        }
    }
}

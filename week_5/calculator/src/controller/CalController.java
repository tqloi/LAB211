package controller;

import Library.Input;
import model.Calculator;

public class CalController {

    private Calculator cal;
    private Input ip;

    public CalController() {
        cal = new Calculator();
        ip = new Input();
    }

    public void normalCal() {
        System.out.println("----- Normal Calculator -----");
        Double a = ip.getDouble("number");
        cal.setMemory(a);
        while (true) {
            String operator = ip.getOperator("operator");
            if (operator.equals("=")) {
                break;
            }
            Double b = ip.getDouble("number");
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
        int weight = ip.getInt("weight(kg)");
        int height = ip.getInt("height(cm)");
        cal.BMI(weight, height);
        double bmi = cal.getMemory();
        System.out.println("BMI: " + bmi);
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

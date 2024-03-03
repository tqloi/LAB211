package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public double getDouble(String name) {
        double number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextDouble();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("Invalid number!");
                sc.next();
            }
        }
    }

    public int getInt(String name) {
        int number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("BMI is digit");
                sc.next();
            }
        }
    }

    public String getOperator(String name) {
        String operator;
        do {
            System.out.print("Enter " + name + ": ");
            operator = sc.nextLine();
            if (!isValidOperator(operator)) {
                System.err.println("Please input (+, -, *, /, ^)");
            }
        } while (!isValidOperator(operator));
        return operator;
    }

    private boolean isValidOperator(String operator) {
        return operator.matches("\\+|\\-|\\*|\\/\\^|\\=");
    }
}

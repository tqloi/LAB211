package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static double getDouble(String name) {
        Scanner sc = new Scanner(System.in);
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

    public static int getInt(String name) {
        Scanner sc = new Scanner(System.in);
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

    public static String getOperator(String name) {
        Scanner sc = new Scanner(System.in);
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

    private static boolean isValidOperator(String operator) {
        return operator.matches("\\+|\\-|\\*|\\/\\^|\\=");
    }
}

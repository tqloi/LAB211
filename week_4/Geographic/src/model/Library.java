package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

    public static String getStringFromInput(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print("Enter " + name + ":");
            s = sc.nextLine();
        }
        return s;
    }

       public static double getDoubleFromInput(String name) {
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
}

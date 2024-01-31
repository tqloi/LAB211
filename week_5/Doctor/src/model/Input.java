package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static int getInt(String name) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("Invalid input!");
                sc.next();
            }
        }
    }

    public static String getString(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print("Enter " + name + ": ");
            s = sc.nextLine();
        }
        return s;
    }
}

package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public double getDoubleFromInput(String name) {
        double number;
        while (true) {

            System.out.print(name + ": ");
            try {
                number = scanner.nextDouble();
                if (number > 0) {
                    return number;
                }
            } catch (InputMismatchException e) {
                System.err.println("Only enter number");
                scanner.next();
            }
        }
    }

    public int getIntFromInput(String name) {
        int number;
        while (true) {
            System.out.print(name + ": ");
            try {
                number = scanner.nextInt();
                if (number > 0 && number <= 20) {
                    return number;
                }
            } catch (InputMismatchException e) {
                System.err.println("Only enter integer number");
                scanner.next();
            }
        }
    }

    public String getStringFromInput(String name) {
        System.out.print("Enter " + name + ": ");
        String s = scanner.nextLine();
        return s;
    }
}

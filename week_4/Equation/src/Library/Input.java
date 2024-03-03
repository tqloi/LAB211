package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);
    
    public double getDoubleFromInput(String name) {
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

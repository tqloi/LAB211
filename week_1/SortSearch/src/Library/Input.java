package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public int getIntFromInput(String name) {

        int number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid integer.");
                sc.next();
            }
        }
    }
}

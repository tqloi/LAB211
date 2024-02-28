package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.print(prompt + ": ");
        return sc.nextLine();
    }

    public float getMark(String name) {
        float number;
        while (true) {
            System.out.print(name + ": ");
            try {
                number = sc.nextFloat();
                sc.nextLine();
                if (number >= 0 && number <= 100) {
                    return number;
                } else {
                    System.err.println("Please enter a valid mark!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid mark!");
                sc.nextLine();
            }
        }
    }
}

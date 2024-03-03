package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public int getInt(String name) {
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

    public String getString(String name) {
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print("Enter " + name + ": ");
            s = sc.nextLine();
        }
        return s;
    }
}

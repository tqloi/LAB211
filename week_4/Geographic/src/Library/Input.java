package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getStringFromInput(String name) {
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print("Enter " + name + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public float getFloat(String name) {
        float number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextFloat();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("Invalid number!");
                sc.next();
            }
        }
    }
    
    public void closeScanner() {
        sc.close();
    }
}

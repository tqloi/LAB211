package Library;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public double getDouble(String msg) {
        double nDouble = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Please input " + msg + ": ");
                String n = sc.nextLine();
                nDouble = Double.parseDouble(n);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
            }
        }
        return nDouble;
    }
}

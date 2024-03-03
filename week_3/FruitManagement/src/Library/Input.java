package Library;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.print(msg + ": ");
        return sc.nextLine();
    }

    public int getInt(String msg) {
        int nInt = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print(msg + ": ");
                String n = sc.nextLine();
                nInt = Integer.parseInt(n);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }
        return nInt;
    }

    public double getDouble(String msg) {
        double nInt = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print(msg + ": ");
                String n = sc.nextLine();
                nInt = Double.parseDouble(n);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid double.");
            }
        }
        return nInt;
    }

}

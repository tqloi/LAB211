package Library;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.print("Enter " + msg + ": ");
        return sc.nextLine();
    }

    public int getInt(String name) {
        int number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.err.println("ID is a digit");
                sc.next();
            }
        }
    }

    public String getPhone() {
        String phone;
        while (true) {
            System.out.print("Enter phone: ");
            phone = sc.nextLine();
            if (isValidPhoneNumber(phone)) {
                return phone;
            } else {
                System.out.println("Please input Phone flow");
                System.out.println("• 1234567890");
                System.out.println("• 123-456-7890");
                System.out.println("• 123-456-7890 x1234");
                System.out.println("• 123-456-7890 ext1234");
                System.out.println("• (123)-456-7890");
                System.out.println("• 123.456.7890");
                System.out.println("• 123 456 7890");
            }
        }
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String phonePattern = "^\\(?(\\d{3})\\)?[-.\\s]?(\\d{3})[-.\\s]?(\\d{4})\\s?(x\\d{1,4})?$";
        return Pattern.matches(phonePattern, phoneNumber);
    }
}

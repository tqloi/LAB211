package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private int counter = 1;
    private Scanner sc = new Scanner(System.in);

    public String generateId(String prefix) {

        String id = prefix + String.format("%04d", counter);
        counter++;
        return id;
    }

    public int getIntFromInput(String name) {
        int number;
        while (true) {
            System.out.print("Enter " + name + ": ");
            try {
                number = sc.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.err.println("Please enter the integer number > 0 ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Only enter the integer number > 0 ");
                sc.next();
            }
        }
    }

    public String getStringFromInput(String name) {
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print("Enter " + name + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public String getEmailFromInput(String name) {
        String email;
        do {
            System.out.print(name + ": ");
            email = sc.nextLine();
            if (!isValidEmail(email)) {
                System.err.println("Email is not valid!");
            }
        } while (!isValidEmail(email));
        return email;
    }

    public int getYearFromInput(String name) {
        int year;
        do {
            System.out.print(name + ": ");
            year = sc.nextInt();
            sc.nextLine();
            if (!isValidBirthYear(year)) {
                System.err.println("Birth year is not valid!");
            }
        } while (!isValidBirthYear(year));
        return year;
    }

    public String getPhoneNumberFromInput(String name) {
        String phoneNumber;
        do {
            System.out.print(name + ": ");
            phoneNumber = sc.nextLine();
            if (!isValidPhoneNumber(phoneNumber)) {
                System.err.println("Phone number is not valid!");
            }
        } while (!isValidPhoneNumber(phoneNumber));
        return phoneNumber;
    }

    public String getRankFromInput(String name) {
        String graduationRank;
        do {
            System.out.print(name + ": ");
            graduationRank = sc.nextLine();
            if (!isValidRank(graduationRank)) {
                System.err.println("Please enter 'Excellence', 'Good', 'Fair', or 'Poor'!");
            }
        } while (!isValidRank(graduationRank));
        return graduationRank;
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    private boolean isValidBirthYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        return year >= 1900 && year <= currentYear;
    }

    private boolean isValidPhoneNumber(String number) {
        return number.matches("\\d{10,}");
    }

    private boolean isValidRank(String graduationRank) {
        return graduationRank.matches("Excellence|Good|Fair|Poor");
    }
}

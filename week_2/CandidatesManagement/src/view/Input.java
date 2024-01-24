package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static int counter = 1;

    public static String generateId(String prefix) {

        String id = prefix + String.format("%04d", counter);
        counter++;
        return id;
    }

    public static int getIntFromInput(String name) {
        Scanner sc = new Scanner(System.in);
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

    public static String getStringFromInput(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print("Enter " + name + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public static String getEmailFromInput(String name) {
        Scanner sc = new Scanner(System.in);
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

    public static int getYearFromInput(String name) {
        Scanner sc = new Scanner(System.in);
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

    public static String getPhoneNumberFromInput(String name) {
        Scanner sc = new Scanner(System.in);
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

    public static String getRankFromInput(String name) {
        Scanner sc = new Scanner(System.in);
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

    private static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    private static boolean isValidBirthYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        return year >= 1900 && year <= currentYear;
    }

    private static boolean isValidPhoneNumber(String number) {
        return number.matches("\\d{10,}");
    }

    private static boolean isValidRank(String graduationRank) {
        return graduationRank.matches("Excellence|Good|Fair|Poor");
    }
}

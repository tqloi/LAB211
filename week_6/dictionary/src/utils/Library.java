package utils;

import java.util.Scanner;

public class Library {

    private Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.print(msg + ": ");
        return sc.nextLine().toLowerCase();
    }
}

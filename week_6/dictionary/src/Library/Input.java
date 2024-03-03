package Library;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.print(msg + ": ");
        return sc.nextLine().toLowerCase();
    }
}

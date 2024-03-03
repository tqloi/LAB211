package Library;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.print(prompt + ": ");
        return sc.nextLine();
    }
}

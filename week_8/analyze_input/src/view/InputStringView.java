package view;

import controller.StringController;
import java.util.Scanner;

public class InputStringView {

    private StringController stringController;

    public InputStringView() {
        stringController = new StringController();
    }

    public void run() {
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("-----Result Analysis------");
        stringController.getAnalyzeString(input);
    }

}

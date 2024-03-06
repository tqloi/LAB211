package view;

import Library.Input;
import controller.StudentController;

public class InfoView {

    private StudentController sc;
      private Input ip;
    
    public InfoView() {
        sc = new StudentController();   
        ip = new Input();
    }

    public void run() {
        System.out.println("====== Collection Sort Program ======");
        String inputMore;
        do {
            System.out.println("Please input student information ");
            sc.getInput();
            inputMore = ip.getString("Do you want to enter more student information? (Y/N)");
        } while (inputMore.toLowerCase().equals("y"));
        sc.display();
    }   
}

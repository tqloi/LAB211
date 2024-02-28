package view;

import Library.Input;
import controller.InfoController;
import model.Student;

public class InfoView {

    private InfoController ic;
    private Input input;

    public InfoView() {
        ic = new InfoController();
        input = new Input();
    }

    public void run() {
        System.out.println("====== Collection Sort Program ======");
        String inputMore;
        do {
            System.out.println("Please input student information ");
            String name = input.getString("Name");
            String clss = input.getString("Class");
            float mark = input.getMark("Mark");
            ic.addStudent(new Student(name, clss, mark));
            inputMore = input.getString("Do you want to enter more student information? (Y/N)");
        } while (inputMore.toLowerCase().equals("y"));
        ic.sortStudents();
        ic.display();
    }
}

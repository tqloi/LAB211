package controller;

import Library.Input;
import model.Student;
import model.StudentList;

public class StudentController {

    private StudentList sList;
    private Input input;

    public StudentController() {
        sList = new StudentList();
        input = new Input();
    }

    public void getInput() {
        String name = input.getString("Name");
        String clss = input.getString("Class");
        float mark = input.getMark("Mark");
        sList.addStudent(new Student(name, clss, mark));
    }

    public void display() {
        sList.display(sList.sortStudents(sList.getStudents()));
    }

}

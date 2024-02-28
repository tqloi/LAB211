package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Student;

public class InfoController {

    private List<Student> students;

    public InfoController() {
        students = new ArrayList<>();
    }

    public List<Student> sortStudents() {
        Collections.sort(students);
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void display() {
        int i = 1;
        for (Student s : students) {
            System.out.println("-------------Student " + i + "-------------");
            System.out.println(s);
            i += 1;
        }
    }
}

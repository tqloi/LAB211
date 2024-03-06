package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

    private List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortStudents(List <Student> students) {
        Collections.sort(students);
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void display(List <Student> students) {
        int i = 1;
        for (Student s : students) {
            System.out.println("-------------Student " + i + "-------------");
            System.out.println(s);
            i += 1;
        }
    }
}

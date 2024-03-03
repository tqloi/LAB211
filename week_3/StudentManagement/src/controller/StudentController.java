
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import model.Course;
import model.Student;

public class StudentController {

    private List<Student> students;

    public StudentController() {
        this.students = new ArrayList<>();

        Course course = new Course();
        course.add("LAB");
        course.add("CSD");
        course.add("DBI");
        course.add("CSD");
        Course course2 = new Course();

        course2.add("WEDc");

        students.add(new Student(1, "Dat", "1", course));
        students.add(new Student(2, "Loi", "2", course2));
        students.add(new Student(3, "Huy", "1", course2));
        students.add(new Student(4, "Gia", "1", course));
        students.add(new Student(5, "Hoa", "1", course));

    }

    public List<Student> getStudents() {
        return students;
    }

    public void createStudent(Student s) {
        int id = students.size() + 1;
        s.setId(id);
        students.add(s);
    }

    public Student search(Predicate<Student> p) {
        for (Student s : students) {
            if (p.test(s)) {
                return s;
            }
        }
        return null;
    }

    public void sortStudents() {
        System.out.println(String.format(" %-10s | %-8s | %-20s | %-5s", "Name", "Semester", "Courses", "Total"));
        Collections.sort(students);
    }

    public Student updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == student.getId()) {
                if (!student.getStudentName().isEmpty() || !student.getSemester().isEmpty() || !student.getCourse().getCourse().isEmpty()) {
                    s.setCourse(student.getCourse());
                    s.setSemester(student.getSemester());
                    s.setStudentName(student.getStudentName());
                    return s;
                } 
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    public void displayStudents() {
        System.out.println(String.format(" %-10s | %-20s | %-5s", "Name", "Courses", "Total"));
        for (Student s : students) {
            System.out.println(String.format(" %-10s | %-20s | %-5s",
                    s.getStudentName(), s.getCourse().getCourse(), s.getCourse().size()));
        }
    }

}

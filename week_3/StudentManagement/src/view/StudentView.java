package view;

import model.Course;
import model.Student;
import Library.Input;

public class StudentView extends Menu {

    private controller.StudentController sList;
    private Input ip;

    public StudentView() {
        super("Student management", new String[]{"Create", "Find/Sort", "Update/Delete", "Report", "Exit"});
        sList = new controller.StudentController();
        ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                createStudent();
                break;
            case 2:
                findAndSort();
                break;
            case 3:
                updateAndDelete();
                break;
            case 4:
                reportList();
                break;
            case 5:
                exitMenu();
        }
    }

    public void createStudent() {
        String studentName = ip.getString("Enter name of student");
        String semester = ip.getString("Enter semester of student");
        Course course = new Course();
        String choice;
        do {
            String c = ip.getString("Enter the name of course");

            choice = ip.getString("Do you want to continue?(Y/N)");
            course.add(c);
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Exiting program...");

        Student s = new Student(studentName, semester, course);
        sList.createStudent(s);
    }

    public void findAndSort() {
        String name = ip.getString("Enter student name");
        System.out.println(sList.search(p -> p.getStudentName().contains(name)));
        sList.sortStudents();
    }

    public void updateAndDelete() {
        int id = ip.getInt("Enter the studentID");

        if (sList.search(student -> student.getId() == id) != null) {
            String option = ip.getString("Do you want to update (U) or delete (D) student");

            switch (option.toUpperCase()) {
                case "U":
                    String studentName = ip.getString("Enter name of student");
                    String semester = ip.getString("Enter the current semester");
                    Course course = new Course();
                    String choice;

                    do {
                        String c = ip.getString("Enter the name of course");
                        choice = ip.getString("Do you want to continue? (Y/N)");
                        course.add(c);
                    } while (choice.equalsIgnoreCase("Y"));

                    sList.updateStudent(new Student(id, studentName, semester, course));
                    System.out.println("Information Updated!");
                    break;

                case "D":
                    sList.deleteStudent(id);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

        } else {
            System.out.println("Student ID does not exist!");
        }
    }

    public void reportList() {
        sList.displayStudents();
    }

}

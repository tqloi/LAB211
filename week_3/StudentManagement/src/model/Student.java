
package model;

public class Student implements Comparable<Student>{

    private int id;
    private String studentName;
    private String semester;
    private Course course;

    public Student(int id, String studentName, String semester, Course course) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.course = course;
    }

    public Student(String studentName, String semester, Course course) {
        this.studentName = studentName;
        this.semester = semester;
        this.course = course;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return o.getStudentName().compareTo(studentName);
    }

    @Override
    public String toString() {
        return String.format(" %-10s | %-8s | %-20s | %-5s", studentName, semester, course.getCourse(), course.size()) ;
    }


}

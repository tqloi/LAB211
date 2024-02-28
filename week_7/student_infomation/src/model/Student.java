package model;

public class Student implements Comparable<Student> {

    private String name;
    private String clss;
    private float mark;

    public Student() {
    }

    public Student(String name, String clss, float mark) {
        this.name = name;
        this.clss = clss;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClss() {
        return clss;
    }

    public void setClss(String clss) {
        this.clss = clss;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nClasses: %s\nMark: %.1f", name, clss, mark);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}

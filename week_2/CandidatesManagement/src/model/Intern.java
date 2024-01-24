package model;

public class Intern extends Candidate {

    private String major;
    private String semester;
    private String university;

    public Intern(String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String major, String semester, String university) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %-10s | %-10s | %-5s ",major, semester, university);
    }
}

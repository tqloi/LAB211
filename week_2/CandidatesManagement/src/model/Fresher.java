
package model;

public class Fresher extends Candidate{
    
    private int graduationDate;
    private String graduationRank;

    public Fresher(String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, int graduationDate, String graduationRank) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
       return super.toString() + String.format(" | %-10d | %-5s", graduationDate, graduationRank);
    }

    
    
}

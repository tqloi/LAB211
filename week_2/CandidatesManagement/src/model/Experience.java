package model;

public class Experience extends Candidate {

    private int expYear;
    private String proSkill;

    public Experience(String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, int expYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %-10d | %-5s ", expYear, proSkill);
    }
}

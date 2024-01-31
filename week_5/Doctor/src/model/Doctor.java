package model;

public class Doctor {

    private String code;
    private String name;
    private String specialization;
    private int availability;

    public Doctor(String code, String name, String Specialization, int Availability) {
        this.code = code;
        this.name = name;
        this.specialization = Specialization;
        this.availability = Availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String Specialization) {
        this.specialization = Specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int Availability) {
        this.availability = Availability;
    }

    @Override
    public String toString() {
        return String.format("%-8s%-12s%-20s%-5d", code, name, specialization, availability);
    }

    public boolean checkKeyword(String keyword) {
        String s = code + name + specialization + availability;
        return s.toLowerCase().contains(keyword.toLowerCase());
    }

}

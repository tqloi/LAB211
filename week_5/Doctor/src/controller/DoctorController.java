package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import model.Doctor;

public class DoctorController {

    private List<Doctor> doctors;

    public DoctorController() {
        doctors = new ArrayList<>();
        loadDataFromFile("data.txt");
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor o) throws Exception {
        if (doctors == null) {
            throw new Exception("Database does not exist");
        }
        if (o == null || o.getCode() == null || o.getName() == null
                || o.getSpecialization() == null) {
            throw new Exception("Data does not exist");
        }
        doctors.add(o);
        saveDataToFile("data.txt");
    }

    public Doctor updateDoctor(Doctor doctor) throws Exception {
        if (doctors == null) {
            throw new Exception("Database does not exist");
        }
        if (doctor == null || doctor.getCode() == null || doctor.getName() == null
                || doctor.getSpecialization() == null) {
            throw new Exception("Data does not exist");
        }
        for (int i = 0; i < doctors.size(); i++) {
            Doctor s = doctors.get(i);
            if (s.getCode().equals(doctor.getCode())) {
                if (!doctor.getName().isEmpty() || !doctor.getSpecialization().isEmpty() || !String.valueOf(doctor.getAvailability()).isEmpty()) {
                    s.setName(doctor.getName());
                    s.setSpecialization(doctor.getSpecialization());
                    s.setAvailability(doctor.getAvailability());
                    return s;
                }
            }
        }
        saveDataToFile("data.txt");
        return null;
    }

    public boolean deleteVacineByCode(String code) {
        if (doctors.removeIf((Doctor p) -> p.getCode().equals(code))) {
            saveDataToFile("data.txt");
            return true;
        }
        return false;
    }

    public <T> List<T> search(List<T> lists, Predicate<T> predicate) {
        List<T> objectList = new ArrayList<>();
        for (T o : lists) {
            if (predicate.test(o)) {
                objectList.add(o);
            }
        }
        return objectList;
    }

    private void loadDataFromFile(String fileName) {
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split("\\s*\\-\\s*");
                Doctor o = new Doctor(values[0], values[1], values[2], Integer.parseInt(values[3]));
                doctors.add(o);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void saveDataToFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Doctor vacine : doctors) {
                String line = vacine.getCode() + "-" + vacine.getName()
                        + "-" + vacine.getSpecialization() + "-" + vacine.getAvailability();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + e.getMessage());
        }
    }

    public boolean isDoctorCodeInList(String codeToCheck) {
        if (doctors == null || codeToCheck == null) {
            throw new IllegalArgumentException("Input parameters cannot be null");
        }
        for (Doctor doctor : doctors) {
            if (doctor.getCode().equals(codeToCheck)) {
                return true;
            }
        }
        return false;
    }
}

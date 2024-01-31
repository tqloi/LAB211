package view_controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import model.DoctorList;
import model.Input;

public class DoctorManagement extends Menu {

    private DoctorList dList;

    public DoctorManagement() {
        super("=== Doctor Management ===", new String[]{"Add Doctor", "Update Doctor",
            "Delete Doctor", "Search Doctor", "Exit"});
        dList = new DoctorList();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                try {
                    addDoctor();
                } catch (Exception ex) {
                    Logger.getLogger(DoctorManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 2: {
                try {
                    updateDoctor();
                } catch (Exception ex) {
                    Logger.getLogger(DoctorManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 3:
                deleteDoctor();
                break;
            case 4:
                searchDoctor();
                break;
            case 5:
                exitMenu();
                break;
        }
    }

    public void addDoctor() throws Exception {
        System.out.println("------- Add Doctor -------");
        String code = Input.getString("Code");
        if (!dList.isDoctorCodeInList(code)) {
            String name = Input.getString("Name");
            String specialization = Input.getString("Specializtion");
            int availabitity = Input.getInt("Availability");
            Doctor d = new Doctor(code, name, specialization, availabitity);
            dList.updateDoctor(d);
            System.out.println("Succesful");
        }
        System.out.println("Code existed");
    }

    public void updateDoctor() throws Exception {
        System.out.println("------ Update Doctor ------");
        String code = Input.getString("Code");
        if (dList.isDoctorCodeInList(code)) {
            String name = Input.getString("Name");
            String specialization = Input.getString("Specializtion");
            int availabitity = Input.getInt("Availability");
            Doctor d = new Doctor(code, name, specialization, availabitity);
            dList.updateDoctor(d);
            System.out.println("Succesful");
        }
        System.out.println("Code does not exist");
    }

    public void deleteDoctor() {
        System.out.println("------ Delete Doctor ------");
        String code = Input.getString("Code");
        if (dList.deleteVacineByCode(code)) {
            System.out.println("Succesful");
        }
        System.out.println("Code does not exist");
    }

    public void searchDoctor() {
        System.out.println("------ Search Doctor ------");
        String keyword = Input.getString("text");
        List<Doctor> result = dList.search(dList.getDoctors(), (Doctor p) -> p.checkKeyword(keyword));
        System.out.println("--------- Result ---------");
        System.out.println(String.format("%-8s%-12s%-20s%-5s", "Code", "Name", "Specialization", "Availability"));
        for (Doctor o : result) {
            System.out.println(o);
        }
    }
}

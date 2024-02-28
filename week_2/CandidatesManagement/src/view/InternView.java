package view;

import Library.Input;
import java.util.List;
import controller.CandidateController;
import model.Intern;

/**
 *
 * @author LENOVO
 */
public class InternView extends Menu {

    private CandidateController cList;

    public InternView(CandidateController cList) {
        super("Internship Candidate management", new String[]{"Create Candidate", "Display all Candidate",
            "Delete Candidate", "Quit"});
        this.cList = cList;
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                addIntern();
                break;
            case 2:
                listIntern();
                break;
            case 3:
                deleteIntern();
                break;
            case 4:
                exitMenu();
                break;
        }
    }

    private void addIntern() {
        System.out.println("Creating an Intern Candidate:");

        String candidateId = Input.generateId("IN");
        String firstName = Input.getStringFromInput("First Name");
        String lastName = Input.getStringFromInput("Last Name");
        int birthDate = Input.getYearFromInput("Birth Year");
        String address = Input.getStringFromInput("Address");
        String phone = Input.getPhoneNumberFromInput("Phone");
        String email = Input.getEmailFromInput("Email");

        String major = Input.getStringFromInput("Major");
        String semester = Input.getStringFromInput("Semester");
        String university = Input.getStringFromInput("University");

        Intern intern = new Intern(candidateId, firstName, lastName, birthDate, address, phone, email, 2, major, semester, university);
        cList.addInterm(intern);

        System.out.println("Information has been updated!");
    }

    private void listIntern() {
        List<Intern> interns = cList.getInterns();
        if (interns.isEmpty()) {
            System.out.println("Don't have any candidates");
        } else {
            for (Intern i : interns) {
                System.out.println(i);
            }
        }
    }

    private void deleteIntern() {
        String code = Input.getStringFromInput("candidate ID");
        if (cList.delExperience(code)) {
            System.out.println("Delete successfully");
        } else {
            System.out.println("This candidate does not exist");
        }
    }

}

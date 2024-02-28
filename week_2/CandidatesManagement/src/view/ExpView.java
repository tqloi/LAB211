package view;

import Library.Input;
import java.util.List;
import controller.CandidateController;
import model.Experience;

public class ExpView extends Menu {

    private CandidateController cList;

    public ExpView(CandidateController cList) {
        super("Experience Candidate management", new String[]{"Create Candidate", "Display all Candidate",
            "Delete Candidate", "Quit"});
        this.cList = cList;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addExperience();
                break;
            case 2:
                listExperience();
                break;
            case 3:
                deleteExperience();
                break;
            case 4:
                exitMenu();
                break;
        }
    }

    private void addExperience() {
        System.out.println("Creating an Experience Candidate:");
        int currentYear = java.time.Year.now().getValue();

        String candidateId = Input.generateId("EX");
        String firstName = Input.getStringFromInput("First Name");
        String lastName = Input.getStringFromInput("Last Name");
        int birthDate = Input.getYearFromInput("Birth Year");
        String address = Input.getStringFromInput("Address");
        String phone = Input.getPhoneNumberFromInput("Phone");
        String email = Input.getEmailFromInput("Email");

        int expYear;
        do {
            expYear = Input.getYearFromInput("Experience Year");
            if (expYear >= (currentYear - birthDate)) {
                System.err.println("Invalid Experience Year");
            }
        } while (expYear >= (currentYear - birthDate));
        String proSkill = Input.getStringFromInput("Professional Skills");

        Experience experience = new Experience(candidateId, firstName, lastName, birthDate, address, phone, email, 0, expYear, proSkill);
        cList.addExperience(experience);

        System.out.println("Information has been updated!");
    }

    private void listExperience() {
        List<Experience> experiences = cList.getExperiences();
        if (experiences.isEmpty()) {
            System.out.println("Don't have any candidates");
        } else {
            for (Experience e : experiences) {
                System.out.println(e);
            }
        }
    }

    private void deleteExperience() {
        String code = Input.getStringFromInput("candidate ID");
        if (cList.delExperience(code)) {
            System.out.println("Delete successfully");
        } else {
            System.out.println("This candidate does not exist");
        }
    }

}

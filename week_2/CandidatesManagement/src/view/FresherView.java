package view;

import Library.Input;
import java.util.List;
import controller.CandidateController;
import model.Fresher;

public class FresherView extends Menu {

    private CandidateController cList;

    public FresherView(CandidateController cList) {
        super("Fresher Candidate management", new String[]{"Create Candidate", "Display all Candidate",
            "Delete Candidate", "Quit"});
        this.cList = cList;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addFresher();
                break;
            case 2:
                listFresher();
                break;
            case 3:
                deleteExperience();
                break;
            case 4:
                exitMenu();
                break;
        }
    }

    private void addFresher() {
        System.out.println("Creating a Fresher Candidate:");

        String candidateId = Input.generateId("FS");
        String firstName = Input.getStringFromInput("First Name");
        String lastName = Input.getStringFromInput("Last Name");
        int birthDate = Input.getYearFromInput("Birth Year");
        String address = Input.getStringFromInput("Address");
        String phone = Input.getPhoneNumberFromInput("Phone");
        String email = Input.getEmailFromInput("Email");

        int graduationDate;
        do {
            graduationDate = Input.getYearFromInput("Graduation Year");
            if (graduationDate <= birthDate) {
                System.err.println("Invalid Graduation Year!");
            }
        } while (graduationDate <= birthDate);
        String graduationRank = Input.getRankFromInput("Graduation Rank");

        Fresher fresher = new Fresher(candidateId, firstName, lastName, birthDate, address, phone, email, 1, graduationDate, graduationRank);
        cList.addFresher(fresher);

        System.out.println("Information has been updated!");
    }

    private void listFresher() {
        List<Fresher> freshers = cList.getFreshers();
        if (freshers.isEmpty()) {
            System.out.println("Don't have any candidates");
        } else {
            for (Fresher f : freshers) {
                System.out.println(f);
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

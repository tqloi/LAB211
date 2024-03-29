package view;

import Library.Input;
import java.util.List;
import controller.CandidateController;
import model.Fresher;

public class FresherView extends Menu {

    private CandidateController cList;
    private Input ip;

    public FresherView(CandidateController cList) {
        super("Fresher Candidate management", new String[]{"Create Candidate", "Display all Candidate",
            "Delete Candidate", "Quit"});
        this.cList = cList;
        ip = new Input();
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

        String candidateId = ip.generateId("FS");
        String firstName = ip.getStringFromInput("First Name");
        String lastName = ip.getStringFromInput("Last Name");
        int birthDate = ip.getYearFromInput("Birth Year");
        String address = ip.getStringFromInput("Address");
        String phone = ip.getPhoneNumberFromInput("Phone");
        String email = ip.getEmailFromInput("Email");

        int graduationDate;
        do {
            graduationDate = ip.getYearFromInput("Graduation Year");
            if (graduationDate <= birthDate) {
                System.err.println("Invalid Graduation Year!");
            }
        } while (graduationDate <= birthDate);
        String graduationRank = ip.getRankFromInput("Graduation Rank");

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
        String code = ip.getStringFromInput("candidate ID");
        if (cList.delExperience(code)) {
            System.out.println("Delete successfully");
        } else {
            System.out.println("This candidate does not exist");
        }
    }
}

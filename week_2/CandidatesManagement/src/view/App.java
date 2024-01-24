package view;

import controller.ExpController;
import controller.FresherController;
import controller.InternController;
import java.util.List;
import model.CandidateList;
import model.Experience;
import model.Fresher;
import model.Intern;

public class App extends Menu {

    private CandidateList cList;

    public App(CandidateList cList) {
        super("CANDIDATE MANAGEMENT SYSTEM", new String[]{"Experience", "Fresher",
            "Internship", "Searching", "Quit"});
        this.cList = cList;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                new ExpController(cList).run();
                break;
            case 2:
                new FresherController(cList).run();
                break;
            case 3:
                new InternController(cList).run();
                break;
            case 4:
                System.out.println("List of candidate:");
                printAllNames();
                String name = Input.getStringFromInput("Candidate Name");
                int type = Input.getIntFromInput("type of candidate");
                switch (type) {
                    case 0:
                        List<Experience> result0 = cList.search(cList.getExperiences(), (Experience p) -> p.checkName(name));
                        System.out.println(result0);
                        break;
                    case 1:
                        List<Fresher> result1 = cList.search(cList.getFreshers(), (Fresher p) -> p.checkName(name));
                        System.out.println(result1);
                        break;
                    case 2:
                        List<Intern> result2 = cList.search(cList.getInterns(), (Intern p) -> p.checkName(name));
                        System.out.println(result2);
                        break;
                    default:
                        System.out.println("Invalid candidate type.");
                }
                break;
            case 5:
                exitMenu();
                break;
        }
    }

    private void printAllNames() {
    List<Experience> experiences = cList.getExperiences();
    List<Fresher> freshers = cList.getFreshers();
    List<Intern> interns = cList.getInterns();

    System.out.println("  EXPERIENCE CANDIDATE");
    for (Experience experience : experiences) {
        String fullName = experience.getFirstName() + " " + experience.getLastName();
        System.out.println(fullName);
    }

    System.out.println("  FRESHER CANDIDATE");
    for (Fresher fresher : freshers) {
        String fullName = fresher.getFirstName() + " " + fresher.getLastName();
        System.out.println(fullName);
    }

    System.out.println("  INTERN CANDIDATE");
    for (Intern intern : interns) {
        String fullName = intern.getFirstName() + " " + intern.getLastName();
        System.out.println(fullName);
    }
}


    public static void main(String[] args) {
        CandidateList cL = new CandidateList();
        new App(cL).run();
    }
}

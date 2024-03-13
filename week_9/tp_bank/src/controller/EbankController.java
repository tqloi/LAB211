package controller;

import model.Ebank;
import view.EbankView;

public class EbankController {
    private Ebank model;
    private EbankView view;

    public EbankController(Ebank model, EbankView view) {
        this.model = model;
        this.view = view;
    }

    public void runEbankSystem() {
        int choice;

        do {
            choice = view.displayMenuAndGetChoice();
            processUserChoice(choice);
        } while (choice != 3);
    }

    @SuppressWarnings("fallthrough")
    private void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                model.setLocate("En");
                view.setLocate("En");
                break;
            case 2:
                model.setLocate("Vi");
                view.setLocate("Vi");
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid option. Please choose again.");
        }

        String accountNumber = view.getAccountNumber();
        String password = view.getPassword();
        String captchaGenerated = model.generateCaptcha();
        String captchaInput = view.getCaptchaInput(captchaGenerated);
        //cai xong truyen them cai captchagenerated lấy từ generate là xong
        model.login(accountNumber, password, captchaInput, captchaGenerated);
    }
}

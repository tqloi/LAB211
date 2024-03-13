package view;

import model.Ebank;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EbankView {

    private Scanner scanner;
    private Ebank ebank;
    private ResourceBundle messages;

    public EbankView(Ebank ebank) {
        this.ebank = ebank;
        this.scanner = new Scanner(System.in);
    }

    public void setLocate(String locate) {
        String baseName = "Model.Language_" + locate;
        this.messages = ResourceBundle.getBundle(baseName, java.util.Locale.getDefault());
    }

    public int displayMenuAndGetChoice() {
        System.out.println("Login Program");
        System.out.println("-----------------------");
        System.out.println("1. English");
        System.out.println("2. Vietnamese");
        System.out.println("3. Exit");
        System.out.println("-----------------------");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public String getAccountNumber() {
        String accountNumber;
        do {
            System.out.print(messages.getString("account.enterNumber"));
            accountNumber = scanner.next();
            System.out.println(ebank.checkAccountNumber(accountNumber));
        } while (!accountNumber.matches("\\d{10}"));
        return accountNumber;
    }

    public String getPassword() {
        String password;
        do {
            System.out.print(messages.getString("password.enterPassword"));
            password = scanner.next();
            System.out.println(ebank.checkPassword(password));
        } while (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,31}$"));
        return password;
    }

    public String getCaptchaInput(String captchaGenerated) {
        String captchaInput;
        do {
            System.out.println(messages.getString("captcha.generated") + captchaGenerated);
            System.out.print(messages.getString("captcha.enterCharacter"));
            captchaInput = scanner.next();
            if (!captchaGenerated.contains(captchaInput)) {
                System.out.println(messages.getString("captcha.invalid"));
            }
        } while (!captchaGenerated.contains(captchaInput));
        return captchaInput;
    }
}

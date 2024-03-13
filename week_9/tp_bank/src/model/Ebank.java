package model;

import java.util.Random;
import java.util.ResourceBundle;

public class Ebank {

    private ResourceBundle messages;

    public void setLocate(String locate) {
        String baseName = "Model.Language_" + locate;
        this.messages = ResourceBundle.getBundle(baseName, java.util.Locale.getDefault());
    }

    public String checkAccountNumber(String accountNumber) {
        String regex = "\\d{10}";
        if (accountNumber.matches(regex)) {
            return messages.getString("account.valid");
        } else {
            return messages.getString("account.invalid");
        }
    }

    public String checkPassword(String password) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        if (password.matches(regex)) {
            return messages.getString("password.valid");
        } else {
            return messages.getString("password.invalid");
        }
    }

    public int randomRange(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min + 1) + min;
    }

    public String generateCaptcha() {

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String alphaNumeric = alpha + alpha.toUpperCase() + digits;

        String res = "";
        for (int i = 0; i < 5; i++) {
            res += alphaNumeric.charAt(randomRange(0, alphaNumeric.length() - 1));
        }

        return res;
    }

    public boolean checkCaptcha(String captchaInput, String captchaGenerate) {
        if (captchaInput.equals(captchaGenerate)) {
//            return messages.getString("captcha.valid");
            return true;
        }
//        return messages.getString("captcha.invalid");
        return false;
    }

    // them 1 tham so capcha de cho sanh
    public void login(String accountNumber, String password, String captchaInput, String captchaGenerate) {
        String accountResult = checkAccountNumber(accountNumber);
        String passwordResult = checkPassword(password);
        boolean captchaResult = checkCaptcha(captchaInput, captchaGenerate);
        System.out.println(captchaResult);
        if (captchaResult) {
            displayMessage(messages.getString("login.success"));
        } else {
            displayMessage(messages.getString("login.failure"));
            System.out.println("dcm m");
        }
    }

    private void displayMessage(String message) {
        System.out.println(message);
    }
}

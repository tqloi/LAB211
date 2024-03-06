package controller;

import Library.Input;
import model.DataFormatModel;

public class DataFormatController {

    private Input ip;
    private DataFormatModel dfm;

    public DataFormatController() {
        ip = new Input();
        dfm = new DataFormatModel();
    }

    public void formatPhone() {
        String phone;
        do {
            phone = ip.getString("Phone number");
            System.out.println(dfm.checkPhone(phone));
        } while (!dfm.checkPhone(phone).equals("-------------------------------"));

    }

    public void formatEmail() {
        String email;
        do {
            email = ip.getString("Email");
            System.out.println(dfm.checkEmail(email));
        } while (!dfm.checkEmail(email).equals("-------------------------------"));
    }

    public void formatDate() {
        String date;
        do {
            date = ip.getString("Date");
            System.out.println(dfm.checkDate(date));
        } while (!dfm.checkDate(date).equals("-------------------------------"));
    }
}

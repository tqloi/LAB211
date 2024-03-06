package model;

import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatModel {

    public DataFormatModel() {
    }

    public String checkPhone(String phone) {
        if (!phone.matches("\\d+")) {
            return "Phone number must be numbers";
        } else if (phone.length() != 10) {
            return "Phone number must be 10 digits";
        }
        return "-------------------------------";
    }

    public String checkEmail(String email) {
        if (!Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", email)) {
            return "Email must be in correct format";
        }
        return "-------------------------------";
    }

    public String checkDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            Date parsedDate = sdf.parse(date);
            if (parsedDate != null) {
                return "-------------------------------";
            }
        } catch (ParseException e) {

        }
        return "Date must be in correct format (dd/MM/yyyy)";
    }
}

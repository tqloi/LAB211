package view_controller;

import java.util.List;
import model.EastAsiaCountries;
import model.Library;
import model.ListCountry;

public class ManageEastAsiaCountries extends Menu {

    private ListCountry cList;
    
    public ManageEastAsiaCountries() {
        super("========= MENU =========",
                new String[]{"Input the information of 11 countries in East Asia",
                    "Display the information of country you've just input",
                    "Search the information of country by user-entered name",
                    "Display the information of countries sorted name in ascending order",
                    "Exit"});
        cList = new ListCountry();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                option1();
                break;
            case 2:
                option2();
                break;
            case 3:
                option3();
                break;
            case 4:
                option4();
                break;
            case 5:
                exitMenu();
                break;
        }
    }
    
     private void option1() {
        for (int i = 0; i < 11; i++) {
            String code = Library.getStringFromInput("ID");
            String name = Library.getStringFromInput("Name");
            float area = (float) Library.getDoubleFromInput("Total Area");
            String terrain = Library.getStringFromInput("Terrain");
            EastAsiaCountries e = new EastAsiaCountries(code, name, area, terrain);
            cList.addVacine(e);
        }
        System.out.println("Information for 11 countries entered successfully.");
    }

    private void option2() {
        List<EastAsiaCountries> sortedList = cList.getSorted();
        System.out.println("Displaying already entered information:");
        for (EastAsiaCountries country : sortedList) {
            country.toString();
        }
    }

    private void option3() {
        String searchName = Library.getStringFromInput("country name");
        List<EastAsiaCountries> searchResult = cList.search(cList.getEac(), country -> country.getCountryName().equalsIgnoreCase(searchName));
        if (searchResult.isEmpty()) {
            System.out.println("Country not found.");
        } else {
            System.out.println("Displaying information for the country with name " + searchName + ":");
            for (EastAsiaCountries country : searchResult) {
                country.toString();
            }
        }
    }

    private void option4() {
        List<EastAsiaCountries> sortedList = cList.getSorted();
        System.out.println("Displaying information increasing with the country name:");
        for (EastAsiaCountries country : sortedList) {
            country.toString();
        }
    }
}

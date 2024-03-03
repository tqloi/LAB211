package view_controller;

import java.util.List;
import model.EastAsiaCountries;
import Library.Input;
import controller.CountriesController;

public class CountriesView extends Menu {

    private CountriesController cList;
    private Input ip;

    public CountriesView() {
        super("========= MENU =========",
                new String[]{"Input the information of 11 countries in East Asia",
                    "Display the information of country you've just input",
                    "Search the information of country by user-entered name",
                    "Display the information of countries sorted name in ascending order",
                    "Exit"});
        cList = new CountriesController();
        ip = new Input();
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
        for (int i = 1; i <= 11; i++) {
            System.out.println("===== Country " + i + " =====");
            String id = ip.getStringFromInput("ID");
            String name = ip.getStringFromInput("Name");
            float area = ip.getFloat("Total Area");
            String terrain = ip.getStringFromInput("Terrain");
            EastAsiaCountries e = new EastAsiaCountries(id, name, area, terrain);
            if (cList.addCountry(e) == true) {
                System.out.println("Successful");
            } else {
                System.err.println("Failed");
                i--;
            }
        }
        System.out.println("Information for 11 countries entered successfully.");
    }

    private void option2() {
        List<EastAsiaCountries> sortedList = cList.getSorted();
        System.out.println("Displaying already entered information:");
        for (EastAsiaCountries country : sortedList) {
            System.out.println(country);
        }
    }

    private void option3() {
        String searchName = ip.getStringFromInput("country name");
        List<EastAsiaCountries> searchResult = cList.search(cList.getEac(),
                country -> country.containsKeyword(searchName.toLowerCase()));
        if (searchResult.isEmpty()) {
            System.out.println("Country not found.");
        } else {
            System.out.println("Displaying information for the country with name " + searchName + ":");
            for (EastAsiaCountries country : searchResult) {
                System.out.println(country);
            }
        }
    }

    private void option4() {
        List<EastAsiaCountries> sortedList = cList.getSorted();
        System.out.println("Displaying information increasing with the country name:");
        for (EastAsiaCountries country : sortedList) {
            System.out.println(country);
        }
    }
}

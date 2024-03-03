package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import model.EastAsiaCountries;

public class CountriesController {

    private List<EastAsiaCountries> eacList;

    public CountriesController() {
        eacList = new ArrayList<>();
        eacList.add(new EastAsiaCountries("VIE", "Vietnam", 331, "Mountainous"));
        eacList.add(new EastAsiaCountries("THA", "Thailand", 513, "Plains"));
        eacList.add(new EastAsiaCountries("MYA", "Myanmar", 676, "Mountainous"));
        eacList.add(new EastAsiaCountries("CAM", "Cambodia", 181, "Plains"));
        eacList.add(new EastAsiaCountries("LAO", "Laos", 236, "Mountainous"));
        eacList.add(new EastAsiaCountries("PHI", "Philippines", 300, "Archipelago"));
        eacList.add(new EastAsiaCountries("MAL", "Malaysia", 330, "Coastal"));
        eacList.add(new EastAsiaCountries("SIN", "Singapore", 719, "Urban"));
        eacList.add(new EastAsiaCountries("IND", "Indonesia", 1905, "Archipelago"));
        eacList.add(new EastAsiaCountries("BRU", "Brunei", 5765, "Forest"));
        eacList.add(new EastAsiaCountries("TMR", "Timor-Leste", 14874, "Mountainous"));
    }

    public List<EastAsiaCountries> getEac() {
        return eacList;
    }

    public List<EastAsiaCountries> getSorted() {
        Collections.sort(eacList);
        return eacList;
    }

    public boolean addCountry(EastAsiaCountries e) {
        for (EastAsiaCountries country : eacList) {
            if (country.getCountryName().equals(e.getCountryName())) {
                return false;
            }
        }
        eacList.add(e);
        return true;
    }

    public <T> List<T> search(List<T> lists, Predicate<T> predicate) {
        List<T> objectList = new ArrayList<>();
        for (T o : lists) {
            if (predicate.test(o)) {
                objectList.add(o);
            }
        }
        return objectList;
    }
}

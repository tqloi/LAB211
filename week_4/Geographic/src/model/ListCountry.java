
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ListCountry {
    
    private List<EastAsiaCountries> eacList;

    public ListCountry() {
    }

    public List<EastAsiaCountries> getEac() {
        return eacList;
    }
    
    public List<EastAsiaCountries> getSorted() {
        Collections.sort(eacList);
        return eacList;
    }
    
    public boolean addVacine(EastAsiaCountries e) {
        if (!eacList.contains(e)) {
            eacList.add(e);          
            return true;
        }
        return false;
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

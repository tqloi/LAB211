package controller;

import model.Person;
import model.PersonList;

public class PersonController {
    
    private PersonList personList;
    
    public PersonController(PersonList personList) {
        this.personList = personList;
    }
    
    public void displayInfoPersons(Person[] persons) {
        personList.setPersons(persons);
        for (Person person : personList.sortPerson(personList.getPersons())) {
            System.out.println("Information of Person you have entered:");
            person.displayPersonInfo();
        }
    }
}

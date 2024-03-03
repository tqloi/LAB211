package model;

import java.util.Arrays;

public class PersonList {
    private Person[] persons;
    private int size; 
    
    public PersonList() {
        persons = new Person[10]; 
        size = 0; 
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
        size = persons.length; 
    }

    public Person[] getPersons() {
        return Arrays.copyOf(persons, size); 
    }
    
    public void addPerson(Person p) {
        if (size == persons.length) {
            persons = Arrays.copyOf(persons, size * 2);
        }
        persons[size] = p;
        size++; 
    }
    
    public void sortList() {
        Arrays.sort(persons, 0, size, (p1, p2) -> Double.compare(p1.getSalary(), p2.getSalary()));
    }
}

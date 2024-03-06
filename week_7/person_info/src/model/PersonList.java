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

    public Person[] sortPerson(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (persons[j].getSalary() > persons[j + 1].getSalary()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        return persons;
    }
}

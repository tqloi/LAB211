package view;

import controller.PersonController;
import model.Person;
import Library.Input;

public class PersonInfo extends Menu {

    private PersonController personController;
    private Input ip;

    public PersonInfo(PersonController personController) {
        super("Person Information", new String[]{"Press to add and display info", "Exit"});
        this.personController = personController;
        ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                Person[] persons = new Person[3]; // Khởi tạo mảng Person với kích thước 3
                for (int i = 0; i < 3; i++) {
                    try {
                        String name = ip.getString("Name");
                        String address = ip.getString("Address");
                        String salary = ip.getString("Salary");
                        System.out.println("-----------------------");
                        Person p = Person.inputPersonInfo(name, address, salary);
                        persons[i] = p; // Gán phần tử vào mảng
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        i--;
                    }
                }
                personController.displayInfoPersons(persons);
                break;
            case 2:
                exitMenu();
                break;
        }
    }
}

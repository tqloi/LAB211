package view_controller;

import model.ContactList;
import model.Contact;
import model.Input;

public class ContactController extends Menu {

    private ContactList cl;

    public ContactController() {
        super("========= Contact program =========", new String[]{"Add a contact", "Display all contact", "Delete a contact", "Exit"});
        cl = new ContactList();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addContact();
                break;
            case 2:
                displayAll();
                break;
            case 3:
                deleteId();
                break;
            case 4:
                exitMenu();
                break;

        }
    }

    public void addContact() {
        String name = Input.getString("Name");
        String group = Input.getString("Group");
        String address = Input.getString("Address");
        String phone = Input.getPhone();

        cl.addContact(new Contact(0, name, group, address, phone));
        System.out.println("Successful");
    }

    public void displayAll() {
        if (cl.getContacts().isEmpty()) {
            System.out.println("No contact yet!");
        } else {
            System.out.println(String.format("%-4s%-20s%-15s%-15s%-10s%-15s%-10s",
                    "Id", "Name", "First Name", "Last Name", "Group", "Address", "Phone"));
            for (Contact c : cl.getContacts()) {
                System.out.println(c.toString());
            }
        }
    }

    public void deleteId() {
        int id = Input.getInt("iD to delete");
        if (cl.deleteContact(id)) {
            System.out.println("Successful");
        } else {
            System.out.println("ID not found");
        }
    }
}

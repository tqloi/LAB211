package view;

import controller.ContactController;
import model.Contact;
import Library.Input;

public class ContactView extends Menu {

    private ContactController cl;
    private Input ip;

    public ContactView() {
        super("========= Contact program =========", new String[]{"Add a contact", "Display all contact", "Delete a contact", "Exit"});
        cl = new ContactController();
        ip = new Input();
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
        String name = ip.getString("Name");
        String group = ip.getString("Group");
        String address = ip.getString("Address");
        String phone = ip.getPhone();

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
        int id = ip.getInt("iD to delete");
        if (cl.deleteContact(id)) {
            System.out.println("Successful");
        } else {
            System.out.println("ID not found");
        }
    }
}

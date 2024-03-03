
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contact;

public class ContactController {
    
    private List<Contact> contacts;
    private int idCurrent;
    
    public ContactController() {
        contacts = new ArrayList<>();
    }
    
    public int increaseId() {
        return idCurrent += 1;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    
    
    public void addContact(Contact c) {
        c.setId(increaseId());
        contacts.add(c);
    }
    
    public boolean deleteContact(int id) {
        for (Contact contact : contacts) {
            if(contact.getId() == id) {
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    } 
}

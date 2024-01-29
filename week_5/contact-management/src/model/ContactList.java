
package model;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    
    private List<Contact> contacts;
    private int idCurrent;
    
    public ContactList() {
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

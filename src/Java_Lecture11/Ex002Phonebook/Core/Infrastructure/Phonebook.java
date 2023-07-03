package Java_Lecture11.Ex002Phonebook.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import Java_Lecture11.Ex002Phonebook.Config;
import Java_Lecture11.Ex002Phonebook.Core.Models.Contact;

public class Phonebook {

    private final List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read
    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update
    public boolean update(int index, Contact contact) {
        boolean flag = false;
        if (contains(index)) {
            contacts.set(index, contact);
            flag = true;
        }
        return flag;
    }

    // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        if (!contacts.isEmpty())
            return contacts;
        return null;
    }


    public int count() {
        return contacts.size();
    }

}

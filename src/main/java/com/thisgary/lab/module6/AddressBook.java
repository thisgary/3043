package com.thisgary.lab.module6;

import com.thisgary.lab.module3.Date;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Exercise
--------
The program should perform the following operations:
- Store the data according to the categories. (It contradicts with point 4.)
- Sort the address book by last name.
- Search for a person by last name.
- Search for a person by category
- Print the address, phone number, and date of birth (if available) of a given person.
 */

interface ForNoReason {
    ExtPerson getContactByName(String name);
    ExtPerson getContactByPhone(String phone);
    List<ExtPerson> getContactsByCategory(String category);
    void removeContactByName(String name);
    void removeContactByPhone(String phone);
    void sortByName();
    void sortByCategory();
    String toString();
}

public class AddressBook implements ForNoReason {
    private List<ExtPerson> contacts = new ArrayList<>();

    public void addBusinessAssociate(String name, Address address, String phone, Date birthDate, String company, String position) {
        contacts.add(new BusinessAssociate(name, address, phone, birthDate, company, position));
    }

    public void addFamily(String name, Address address, String phone, Date birthDate, String relation) {
        contacts.add(new Family(name, address, phone, birthDate, relation));
    }

    public void addFriend(String name, Address address, String phone, Date birthDate, String note) {
        contacts.add(new Friend(name, address, phone, birthDate, note));
    }

    public List<ExtPerson> getContacts() {
        return contacts;
    }

    // TODO: compress these
    public ExtPerson getContactByName(String name) {
        return contacts.stream().filter(p -> p.getName().toLowerCase().equals(name.toLowerCase()))
                .findFirst().orElse(null);
    }

    public ExtPerson getContactByPhone(String phone) {
        return contacts.stream().filter(p -> p.getPhone() == phone)
                .findFirst().orElse(null);
    }

    public void removeContactByName(String name) {
        contacts.remove(getContactByName(name));
    }

    public void removeContactByPhone(String phone) {
        contacts.remove(getContactByPhone(phone));
    }
    // TODO: compress these

    public List<ExtPerson> getContactsByCategory(String category) {
        return contacts.stream().filter(p -> p.getCategory().equals(category)).collect(Collectors.toList());
    }

    public void sortByName() {
        contacts.sort(Comparator.comparing(ExtPerson::getName));
    }

    public void sortByCategory() {
        contacts.sort(Comparator.comparing(ExtPerson::getCategory));
    }

    public String toString() {
        return "Cozy Address Book\n" +
                contacts.stream().map(ExtPerson::toString).reduce("", (a, b) -> a + "\n" + b);
    }

}

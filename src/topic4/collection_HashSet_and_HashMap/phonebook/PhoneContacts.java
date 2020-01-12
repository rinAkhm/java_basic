package topic4.collection_HashSet_and_HashMap.phonebook;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneContacts {
    private Map<String, Set<Contact>> phoneContacts;

    public PhoneContacts() {
        phoneContacts = new HashMap<>();
    }

    public void addGroup (String group){
        if (!phoneContacts.containsKey(group)) {
            Set<Contact> contacts = new HashSet<>();
            phoneContacts.put(group, contacts);
        }else {
            System.out.println("Данная группа уже существет");
        }
    }
    public void addContact (Contact contact, String group){
        if (!phoneContacts.containsKey(group)) {
            System.out.println("Данная группы не существует, контакт не добавлен");
        }else{
            Set<Contact> contacts = phoneContacts.get(group);
            if (contacts.contains(contact)){
                System.out.println("Данный контакт уже существует в данной группе");
            }else {
                contacts.add(contact);
            }
        }
    }
    public void printContact(){
        System.out.println("Группы в справочнике");
        for (String group : phoneContacts.keySet()){
            System.out.printf("- %s:\n", group);
            Set<Contact> contacts = phoneContacts.get(group);
            for (Contact contact: contacts){
                System.out.println(contact);
            }
            System.out.println();
        }
    }
}
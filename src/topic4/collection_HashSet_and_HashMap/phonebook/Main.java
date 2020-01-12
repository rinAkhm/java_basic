package topic4.collection_HashSet_and_HashMap.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneContacts phoneContacts = new PhoneContacts();

        System.out.println("Программа справочник\n" +
                "Введите название группы контактов:");
        String group = scanner.nextLine().trim();
        phoneContacts.addGroup(group);
        while (true) {
            System.out.println("Создать еще одну группу (введите название или введите нет)?");
            String anotherGroup = scanner.nextLine();
            if ("нет".equals(anotherGroup)) {
                break;
            }
            phoneContacts.addGroup(anotherGroup);
        }
        while (true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");

            //String group1 = scanner.nextLine();
            String nameContact = scanner.nextLine();
            String namePhoneContact = scanner.nextLine();
            phoneContacts.addContact(new Contact(nameContact, namePhoneContact), group);
            if ("нет".equals(nameContact)){
                break;
            }
        }
        phoneContacts.printContact();
    }
}

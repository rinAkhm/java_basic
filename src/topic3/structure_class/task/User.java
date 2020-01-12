package topic3.structure_class.task;

import java.util.Arrays;

public class User {
    String email;
    String name;
    String surname;
    Book[] bookRead;


    public User(String name, String surname, String email, Book[] bookRead) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.bookRead = bookRead;
    }
    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\nЧитает: %s", name, surname, email, Arrays.toString(bookRead));
    }
}

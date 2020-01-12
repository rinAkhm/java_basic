package topic3.structure_class;

import java.util.TreeSet;

public class OnlineReader {
    public static void main(String[] args) {
        TreeSet<Book> volume = new TreeSet<Book>();
        Book value1 = new Book("Пушкин", "Медный всадник", 101, 1837);
        Book value2 = new Book("Пушкин", "Руслан и Людмила", 151, 1820);
        Book value3 = new Book("Пушкин", "Дубровский", 99, 1841);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println();

        volume.add(value1);
        volume.add(value2);
        volume.add(value3);

        System.out.println("Сортировка книги по названию книги (по алфовиту)");
        for (Book e : volume) {
            System.out.println(e);
        }
    }
}


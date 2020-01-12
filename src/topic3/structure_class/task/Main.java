package topic3.structure_class.task;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Лев", "Толстой", "9 сентября 18268г.", "Ясная Поляна");
        authors[1] = new Author("Иван", "Тургенев", "9 ноября 1818г.", "Орёл");
        authors[2] = new Author("Габдула", "Тукай", "26 апреля 1886г.", "Казань");

        Book[] books = new Book[3];
        books[0] = new Book("Война и мир", authors[0], 1963, 501);
        books[1] = new Book("Шурале", authors[2], 1907, 26);
        books[2] = new Book("Кыш бабай", authors[0], 1963, 501);
        User people = new User("Ринат", "Ахметзянов", "pochta@bk.ru", books);
        System.out.printf("%s",people);
        System.out.println();
    }
}





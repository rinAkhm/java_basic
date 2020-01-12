package topic3.structure_class;

public class Book implements Comparable<Book> {
    private String author;
    private String nameBook;
    private int pages;
    private int year;

    public Book(String author, String nameBook, int pages, int year) {
        this.author = author;
        this.nameBook = nameBook;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s,\t'%s', %d стр., %d год.", author, nameBook, pages, year);
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public int compareTo(Book o) {
        return getNameBook().compareTo(o.getNameBook());
    }
}
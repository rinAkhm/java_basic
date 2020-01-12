package topic3.structure_class.task;

public class Book {
    Author author;
    String bookName;
    int  pages;
    int year;

    public Book(String bookName, Author author, int year, int pages) {
        this.author = author;
        this.bookName = bookName;
        this.pages = pages;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("'%s' %d стр. %d г. (%s %s)",bookName,  pages, year, author.name, author.surname);
    }
}


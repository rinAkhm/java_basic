package topic3.accsess_modifer.BookMover.mover;

import topic3.accsess_modifer.BookMover.book.Book;
import topic3.accsess_modifer.BookMover.book.StatusEnum;

public class BookMover {
    protected void moveToStatus(Book book, StatusEnum requestedStatus) {
        System.out.println("Moving status...");
    }
}

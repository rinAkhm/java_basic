package topic3.accsess_modifer.BookMover.mover;

import topic3.accsess_modifer.BookMover.book.Book;
import topic3.accsess_modifer.BookMover.book.StatusEnum;

public class FromOverduedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, StatusEnum requestedStatus) {
        if (book.getStatus() == StatusEnum.OVERDUED){
            switch (requestedStatus){
                case AVAILABLE:
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    break;
                default:
                    System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
            }
        }
    }
}

//package topic3.accsess_modifer.BookMover;
//
//import accsess_modifer.BookMover.book.*;
//import accsess_modifer.BookMover.mover.*;
//import topic3.accsess_modifer.BookMover.book.Book;
//import topic3.accsess_modifer.BookMover.book.StatusEnum;
//import topic3.accsess_modifer.BookMover.mover.FromArchievedStatusMover;
//import topic3.accsess_modifer.BookMover.mover.FromAvailableStatusMover;
//import topic3.accsess_modifer.BookMover.mover.FromBorrowedStatusMover;
//import topic3.accsess_modifer.BookMover.mover.FromOverduedStatusMover;
//
//public class Main {
//    public static void main(String[] args) {
//        Book book = new Book("Властелин колец");
//        FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
//        FromArchievedStatusMover fromArchievedStatusMover = new FromArchievedStatusMover();
//        FromBorrowedStatusMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
//        FromOverduedStatusMover fromOverduedStatusMover = new FromOverduedStatusMover();
//        System.out.println(book.getTittle()+", имеет историю статусов:");
//        System.out.println(book.getStatus());
//        fromAvailableStatusMover.moveToStatus(book, StatusEnum.BORROWED);
//        System.out.println(book.getStatus());
//        fromBorrowedStatusMover.moveToStatus(book, StatusEnum.ARCHIVED);
//        System.out.println(book.getStatus());
//        fromArchievedStatusMover.moveToStatus(book, StatusEnum.AVAILABLE);
//        System.out.println(book.getStatus());
//    }
//}
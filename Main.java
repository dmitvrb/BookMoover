class Main {
    public static void main(String[] args) {

        Book book = new Book("The Lord of the Rings", "AVAILABLE");
        Book book2 = new Book("The Lord of the Rings 2","BORROWED");
        Book book3 = new Book("The Lord of the Rings 3", "ARCHIVED");
        Book book4 = new Book("The Lord of the Rings 4", "OVERDUED");
//        Book book5 = new Book("The Lord of the Rings 5", "SPOILED");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();


        System.out.println("Книга " + book.title + " находится в статусе " + book.getStatus());
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println();

        System.out.println("Книга " + book2.title + " находится в статусе " + book2.getStatus());
        fromBorrowedStatusMover.moveToStatus(book2, Status.OVERDUED);
        fromBorrowedStatusMover.moveToStatus(book2, Status.ARCHIVED);
        fromBorrowedStatusMover.moveToStatus(book2, Status.AVAILABLE);
        System.out.println();

        System.out.println("Книга " + book3.title + " находится в статусе " + book3.getStatus());
        fromArchivedStatusMover.moveToStatus(book3, Status.AVAILABLE);
        fromArchivedStatusMover.moveToStatus(book3, Status.BORROWED);
        fromArchivedStatusMover.moveToStatus(book3, Status.OVERDUED);
        System.out.println();

        System.out.println("Книга " + book4.title + " находится в статусе " + book4.getStatus());
        fromOverduedStatusMover.moveToStatus(book4, Status.AVAILABLE);
        fromOverduedStatusMover.moveToStatus(book4, Status.BORROWED);
        fromOverduedStatusMover.moveToStatus(book4, Status.ARCHIVED);
        System.out.println();


    }
}
public class FromBorrowedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        super.moveToStatus(book, requestedStatus);
        switch (requestedStatus) {
            case AVAILABLE, ARCHIVED, OVERDUED -> {
                System.out.println("статус " + requestedStatus);
                book.setStatus(requestedStatus);
            }
        }
    }
}

public class FromOverduedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        super.moveToStatus(book, requestedStatus);
        switch (requestedStatus) {
            case AVAILABLE, ARCHIVED -> {
                System.out.println("статус " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            case BORROWED -> System.out.println("перевод в статус " + requestedStatus + " невозможен");
        }
    }
}
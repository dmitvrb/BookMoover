public class FromAvailableStatusMover extends BookMover{

    @Override
    public void moveToStatus(Book book, Status requestedStatus){
        super.moveToStatus(book, requestedStatus);
        switch (requestedStatus) {
            case BORROWED, ARCHIVED -> {
                System.out.println("статус " + requestedStatus);
                book.setStatus(requestedStatus);
            }
            case OVERDUED -> System.out.println("перевод в статус " + requestedStatus + " невозможен");
        }
    }
}
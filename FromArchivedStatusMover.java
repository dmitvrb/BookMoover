public class FromArchivedStatusMover extends BookMover {


    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
//        if (book.getStatus().equals(Status.ARCHIVED))

            switch (requestedStatus) {

                case BORROWED, OVERDUED -> System.out.println("перевод в статус " + requestedStatus + " невозможен");
                case AVAILABLE -> {
                    System.out.println("статус " + requestedStatus);
                    book.setStatus(requestedStatus);
                }
            }
        }
    }




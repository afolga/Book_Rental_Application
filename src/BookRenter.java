public class BookRenter {

    Book book = new Book("");
    BookDirectory bookDirectory = new BookDirectory();
    RentDirectory rentedBooksDirectory = new RentDirectory();

    public boolean doRentBookSucceed(String title){

        boolean checkDoRentBookSucceed;
        book.setTitle(title);

        if (bookDirectory.isBookAvailableToRent(title)){
            rentedBooksDirectory.getRentedBooks().add(book);
            checkDoRentBookSucceed = true;
            System.out.println("You have rented a \"" + book.getTitle() + "\" book.");
        }
        else {
            checkDoRentBookSucceed = false;
            System.out.println("The book is not available.");
        }
        return checkDoRentBookSucceed;
    }
}

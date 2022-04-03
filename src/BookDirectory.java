import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class BookDirectory {
    private static List<Book> bookDirectoryList = new ArrayList<Book>();
    private RentDirectory rentedBooksList = new RentDirectory();
    private Book book= new Book("");
   public boolean isBookAvailableToRent(String title){
       boolean checkIsBookAvailableToRent = false;
       book.setTitle(title);
       if(rentedBooksList.isBookToRentInRentDirectory(title)){
           checkIsBookAvailableToRent=false;
       }
       else if (isBookToRentInBookDirectory(title)){
           checkIsBookAvailableToRent=true;
       }
       return checkIsBookAvailableToRent;
   }

    boolean isBookToRentInBookDirectory(String title) {
        Book book = new Book(title);
        boolean checkIsBookInBookDirectory = false;

        for (Book bookInRentDirectory : rentedBooksDirectory) {
            if (bookInRentDirectory.getTitle().equals(book.getTitle())) {
                return true;
            }
        }
        return false;
    }

    public List<Book> getBookDirectory() {
        return bookDirectoryList;
    }
}

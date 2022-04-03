import java.util.ArrayList;
import java.util.List;

public class RentDirectory {
    private static List<Book> rentedBooksDirected = new ArrayList<Book>();
    public List<Book> getRentedBooks(){
        return rentedBooksDirected;
    }
    public boolean isBookToRentInRentDirectory(String title){
        Book book = new Book(title);
        boolean checkIsBookInRentDirectory = false;
        for (Book bookInRentDirectory : rentedBooksDirectory) {
            if (bookInRentDirectory.getTitle().equals(book.getTitle())) {
                checkIsBookInRentDirectory = true;
            }
            else {
                checkIsBookInRentDirectory = false;
            }
            return checkIsBookInRentDirectory;
        }
        return checkIsBookInRentDirectory;
    }
    }


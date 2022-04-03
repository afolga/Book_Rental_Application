public class Customer extends User {
private BookCustomerRentList rentedBooksByCustomer;
BookRenter bookRenter = new BookRenter();
Book book= new Book("");


public Customer(String name){
    this.id=id;
    this.name=name;
    this.privilege=0;
    this.rentedBooksByCustomer= new BookCustomerRentList();
}
    public void rentBook(String title){

        if(bookRenter.doRentBookSucceed(title)){
            book.setTitle(title);
            rentedBooksByCustomer.getBooksRentedByCustomer().add(book);
        }

    }

    public void returnRentedBook(String title){
        book.setTitle(title);
        if (rentedBooksByCustomer.getBooksRentedByCustomer().contains(book)){
            rentedBooksByCustomer.getBooksRentedByCustomer().remove(book);
        }
    }

}

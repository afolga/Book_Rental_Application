public class Book
{
    private int id; //ISBN number???
    private String title;
    private String author;

    public Book(String title, String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }
    public Book(String title){
        this.title=title;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title = title;
    }
}

package hibernate;

public class Book {
	private String title;
    private String author;
    private double price;
    private int bookId;
    
    public Book() {
    	
    }
    
    public Book(String title, String author, double price, int bookId) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

}

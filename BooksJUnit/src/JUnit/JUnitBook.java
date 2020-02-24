package JUnit;

public class JUnitBook {
    String author;
    String title;
    String genre;
    double price;
    double deweyDecimal;
    boolean rented;
    String[] citation;

    public JUnitBook() {

    }

    public JUnitBook(String author, String title, String genre, double price, double deweyD, boolean rented, String[] citation) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.deweyDecimal = deweyD;
        this.rented = rented;
        this.citation = citation;
    }

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public double getDeweyD() {return deweyDecimal;}

    public void setDeweyD(double deweyD) {this.deweyDecimal = deweyD;}

    public boolean getRented() {return rented;}

    public void setRented(boolean rented) {this.rented = rented;}

    public String[] getCitation() {return citation;}

    public void setCitation(String[] citation) {this.citation = citation;}


}

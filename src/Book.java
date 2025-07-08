abstract class Book {
    protected String ISBN ,title,author;
    protected double price;
    protected int YearPublished;

    public Book(String ISBN,String title, String author , int YearPublished,double price ) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.YearPublished = YearPublished;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public double getPrice(){
        return price;
    }
    public int getYearPublished(){
        return YearPublished;
    }

    public abstract boolean isAvailable(int quantity );
    public abstract double buy(int quantity , String email ,String address);


}

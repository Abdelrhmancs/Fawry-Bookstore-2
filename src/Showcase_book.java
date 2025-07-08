public class Showcase_book extends  Book{
    public Showcase_book(String ISBN, String title, String author, int yearPublished) {
        super(ISBN, title, author, yearPublished, 0);
    }

    public boolean isAvailable(int quantity) {
        return false;
    }

    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: ShowcaseBook is not for sale");
    }
}

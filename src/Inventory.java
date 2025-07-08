import java.util.*;
public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
        System.out.println("Quantum book store: Book added - " + book.getTitle());
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next().getValue();
            if (currentYear - book.getYearPublished() > maxAge) {
                System.out.println("Quantum book store: Removing outdated book - " + book.title);
                iterator.remove();
            }
        }
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        Book book = books.get(ISBN);
        if (book == null) throw new RuntimeException("Quantum book store: Book not found");
        double total = book.buy(quantity, email, address);
        System.out.println("Quantum book store: Book purchased - " + book.title + ", Total paid: " + total);
        return total;
    }
}

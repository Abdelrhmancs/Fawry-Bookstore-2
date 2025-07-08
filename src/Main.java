public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Book book1 = new Paper_book("P123", "Introduction to SQL", "Mohamed", 2023, 300, 10);
        Book book2 = new EBook("E456", "Introduction to java ", "Abdelrhman", 2022, 450, "PDF");
        Book book3 = new Showcase_book("S789", "Quantum Theory", "Dr. Sayed", 1992);

        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);

        inventory.removeOutdatedBooks(2025, 10);
        try {
            inventory.buyBook("P123", 2, "ght7234@gmail.com", "mokkattam Cairo ");
            inventory.buyBook("E456", 1, "ght7234@gmail.com", "");
            inventory.buyBook("S789", 1, "", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

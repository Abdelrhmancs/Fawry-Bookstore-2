public class Paper_book extends Book{
    private int stock;

    public Paper_book(String ISBN ,String title, String author , int yearPublished , double price, int stock) {
        super( ISBN ,title , author , yearPublished, price );
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }
    public double buy(int quantity , String email , String address) {
        if (!isAvailable(quantity)) {
            throw new  RuntimeException("Quantum book store: PaperBook not available in stock");
        }
        stock -= quantity;
        ShippingService.send(this, address);
        return quantity * price;
    }
}

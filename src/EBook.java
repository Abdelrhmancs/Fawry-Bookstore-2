public class EBook extends Book{
    private String fileType;

    public EBook(String ISBN,String title,String author,int yearPublished,double price, String fileType) {
        super(ISBN,title,author,yearPublished,price );
        this.fileType = fileType;
    }
    public String getFileType() {
        return fileType;
    }
    public boolean isAvailable(int quantity) {
        return true;
    }
    public double buy(int quantity, String email, String address) {
        MailService.send(this, email);
        return quantity * price;
    }

}

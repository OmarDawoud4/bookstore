public class EBook extends Book {
    private String format;

    public EBook(String ISBN, String title, int publisherYear, double price, String format) {
        super(ISBN, title, publisherYear, price);
        this.format = format;
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        if (email == null || email.isEmpty()) {
            throw new Exception("Email is required to send eBook");
        }
        System.out.println("EBook sent to " + email + " as " + format);
    }
}

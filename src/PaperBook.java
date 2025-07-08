public class PaperBook extends Book {
    private int quantity;

    public PaperBook(String ISBN, String title, int publisherYear, double price, int quantity) {
        super(ISBN, title, publisherYear, price);
        this.quantity = quantity;
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        if (this.quantity < quantity) {
            throw new Exception("Not enough stock for paper book");
        }
        if (address == null || address.isEmpty()) {
            throw new Exception("Shipping address is required for paper books");
        }

        this.quantity -= quantity;
        System.out.println("Paper book purchased and will be shipped to " + address);
    }
}

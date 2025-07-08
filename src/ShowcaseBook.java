public class ShowcaseBook extends Book {

    public ShowcaseBook(String ISBN, String title, int publisherYear) {
        super(ISBN, title, publisherYear, 0.0);
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        if (address == null || address.isEmpty()) {
            throw new Exception("Pickup address is required for showcase book");
        }
        System.out.println("Showcase book reserved for pickup at " + address);
    }
}

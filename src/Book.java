public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int publisherYear;
    protected double price;

    public Book(String ISBN, String title, int publisherYear, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.publisherYear = publisherYear;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPublisherYear() {

        return publisherYear;
    }

    public abstract void buy(int quantity, String email, String address) throws Exception;
}

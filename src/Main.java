public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.addBook(new PaperBook("PB01", "Grokking Algorithms", 2010, 120.0, 5));
        store.addBook(new EBook("EB02", "Data Intensive Applications", 2022, 90.0, "PDF"));
        store.addBook(new ShowcaseBook("SC03", "Clean Code", 1890));

        store.removeOutdatedBooks(2025, 10);

        tryBuy(store, "EB02", 1, "omar@fawry.com", "");
        tryBuy(store, "SC03", 1, "omar@fawry.com", "Tanta");
        tryBuy(store, "PB01", 1, "omar@fawry.com", "Alexandria");
    }

    private static void tryBuy(BookStore store, String isbn, int quantity, String email, String address) {
        try {
            store.buyBook(isbn, quantity, email, address);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

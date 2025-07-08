import java.util.*;

public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getISBN(), book);
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Book book = it.next().getValue();
            if (currentYear - book.getPublisherYear() > maxAge) {
                it.remove();
                System.out.println("Removed outdated book: " + book.getISBN());
            }
        }
    }

    public void buyBook(String ISBN, int quantity, String email, String address) throws Exception {
        Book book = inventory.get(ISBN);
        if (book == null) {
            throw new Exception("Book not found: " + ISBN);
        }
        book.buy(quantity, email, address);
    }
}

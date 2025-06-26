import java.util.HashSet;
import java.util.Iterator;

public class BookStore {
    HashSet<Book> listOfBooks = new HashSet<>();

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public void sellBook(String title) {
        boolean found = false;
        Iterator<Book> iterator = listOfBooks.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBookTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                found = true;
            }
        }
        if (found) {
            System.out.println("Книга: " + title + " продана.");
        } else {
            System.out.println("Книги: " + title + " отсутствует.");
        }
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class BookStore {
    List<Book> listOfBooks = new ArrayList<>();

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

    public  void editBook(String title, String change) {
        for (Book b : listOfBooks) {
            if (b.getBookTitle().equalsIgnoreCase(title)) {

            }
        }
    }
}

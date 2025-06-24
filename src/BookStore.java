import java.util.HashSet;

public class BookStore {
    HashSet<Book> listOfBooks = new HashSet<>();

    public void addBook(Book book) {
        listOfBooks.add(book);
    }


}

public class BookStoreManager {
    public static void main(String[] args) {
        BookStore books = new BookStore();

        books.addBook(new Book("Inferno", "Dan Brown", 405, 2013));
        books.addBook(new Book("The Nightingale","Kristin Hannah", 950, 2018));
        books.addBook(new Book("Fight Club", "Chack Palahniuk", 649, 1996));
        books.addBook(new Book("Dune", "Franklin Patrick Herbert", 800,1965));
        books.addBook(new Book("Gone With the Wind", "Margaret Mitchel", 670, 1936));
    }
}

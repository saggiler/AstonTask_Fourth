import java.util.Objects;

public class Book {
    private String bookTitle;
    private int bookPrice;
    private int releaseData;

    public Book(String bookTitle, int bookPrice, int releaseData) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.releaseData = releaseData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookPrice == book.bookPrice && releaseData == book.releaseData && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookPrice, releaseData);
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Название книги " + bookTitle + '\'' +
                " цена: " + bookPrice +
                " год издания: " + releaseData +
                '}';
    }
}

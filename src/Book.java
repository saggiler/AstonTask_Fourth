import java.util.Objects;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookPrice;
    private int releaseData;

    public Book(String bookTitle, String bookAuthor, int bookPrice, int releaseData) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.releaseData = releaseData;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public int getReleaseData() {
        return releaseData;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setReleaseData(int releaseData) {
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

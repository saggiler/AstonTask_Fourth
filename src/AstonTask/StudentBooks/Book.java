package AstonTask.StudentBooks;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int releaseYear;

    public Book(String title, String author, int pages, int releaseData) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.releaseYear = releaseData;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && releaseYear == book.releaseYear && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages, releaseYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

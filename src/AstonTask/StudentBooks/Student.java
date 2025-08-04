package AstonTask.StudentBooks;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

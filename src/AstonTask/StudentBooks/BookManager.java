package AstonTask.StudentBooks;

import java.util.Comparator;
import java.util.List;

public class BookManager {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        Student sofa = new Student("Sofa");
        Student mila = new Student("Mila");

        jack.addBook(new Book("Inferno", "Dan Brown", 544, 2013));
        jack.addBook(new Book("The Nightingale","Kristin Hannah", 950, 2018));
        jack.addBook(new Book("Fight Club", "Chack Palahniuk", 649, 1996));
        jack.addBook(new Book("Dune", "Franklin Patrick Herbert", 800,1965));
        jack.addBook(new Book("Gone With the Wind", "Margaret Mitchel", 670, 1936));

        sofa.addBook(new Book("Dune", "Franklin Patrick Herbert", 800,1965));
        sofa.addBook(new Book("Inferno", "Dan Brown", 544, 2013));
        sofa.addBook(new Book("The Casual Vacancy", "J. K. Rowling", 590, 2012));
        sofa.addBook(new Book("The Da Vinci Code", "Dan Brown", 590, 2003));
        sofa.addBook(new Book("Crime and Punishment","Fyodor Dostoevsky", 660, 1866));

        mila.addBook(new Book("The Nightingale","Kristin Hannah", 950, 2018));
        mila.addBook(new Book("The Casual Vacancy", "J. K. Rowling", 590, 2012));
        mila.addBook(new Book("The Master and Margarita", "Mikhail Bulgakov", 528,1967));
        mila.addBook(new Book("Invisible man", "Ralph Ellison", 672, 1952));
        mila.addBook(new Book("Fight Club", "Chack Palahniuk", 649, 1996));

        List<Student> students = List.of(jack, sofa, mila);

        students.stream()
                .peek(System.out::println) // Вывод каждого студента
                .flatMap(student -> student.getBooks().stream()) // Получаем книги из каждого студента
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортировка по количеству страниц
                .distinct() // Отсеять уникальные книги
                .filter(book -> book.getReleaseYear() > 2000) // Оставляем только книги после 2000 года
                .limit(3) // Ограничиваем до 3 элементов
                .map(Book::getReleaseYear) // Получить года выпуска книг
                .findFirst() // Метод короткого замыкани
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Книга не найдена") // Если нет значения — выводим сообщение
                );
    }
}

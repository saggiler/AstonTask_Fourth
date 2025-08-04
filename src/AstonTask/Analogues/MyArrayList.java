package AstonTask.Analogues;

public class MyArrayList<T> {
    private T[] elements; // массив, в котором хранятся элементы
    private int size;     // текущее количество элементов

    public MyArrayList() {
        elements = (T[]) new Object[10]; // начальная ёмкость 10
        size = 0;
    }

    public void add(T element) {
        elements[size++] = element;
    }

    // Метод получения элемента по индексу
    public T get(int index) {
        checkIndex(index);
        return elements[index];
    }

    // Метод удаления элемента по индексу
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1]; // сдвиг элементов влево
        }
        elements[--size] = null; // удаление последнего элемента
    }

    // Метод соединения списков
    public void addAll(MyArrayList<T> otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
    }

    // Метод возвращает размер списка
    public int size() {
        return size;
    }

    // Проверка на корректность индекса
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
        }
    }

    // Метод для отображения всех элементов
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    // Пример использования
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Груша");
        list.add("Лимон");
        list.add("Апельсин");

        System.out.println("После добавлений:");
        list.printAll();

        list.remove(1);
        System.out.println("\nСписок после удаления элемента с индексом 1:");
        list.printAll();

        MyArrayList<String> otherList = new MyArrayList<>();
        otherList.add("Слива");
        otherList.add("Ананас");

        list.addAll(otherList);
        System.out.println("\nСписок после addAll:");
        list.printAll();
    }
}

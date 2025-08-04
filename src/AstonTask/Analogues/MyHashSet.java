package AstonTask.Analogues;

public class MyHashSet {

    // Вложенный класс для представления узла в корзине
    private static class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    // Массив корзин (buckets) — каждая корзина может содержать цепочку узлов (LinkedList-подобно)
    private Node[] buckets;

    // Количество элементов в сете
    private int size;

    // Количество корзин (выбирается заранее, влияет на коллизии)
    private static final int DEFAULT_CAPACITY = 16;

    // Конструктор чтобы задать дефолтные значения объекту
    public MyHashSet() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    // Добавление элемента
    public void add(String value) {
        int index = getBucketIndex(value); // Получаем индекс корзины по хэшу

        Node current = buckets[index];
        while (current != null) {
            if (current.value.equals(value)) {
                return; // Уже есть такой элемент — не добавляем дубликаты
            }
            current = current.next;
        }

        // добавляем в начало списка (цепочки) новой нодой
        Node newNode = new Node(value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    // удаление элемента
    public void remove(String value) {
        int index = getBucketIndex(value);

        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    // Удаляем первый элемент в корзине
                    buckets[index] = current.next;
                } else {
                    // Пропускаем текущий узел
                    prev.next = current.next;
                }
                size--;
                return;
            }

            prev = current;
            current = current.next;
        }
    }

    // реализация поиска по хешу
    private int getBucketIndex(String value) {
        return Math.abs(value.hashCode() % buckets.length);
    }

    public int size() {
        return size;
    }

    // распечатать все элементы
    public void printAll() {
        for (int i = 0; i < buckets.length; i++) {
            Node current = buckets[i];
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        }
        System.out.println();
    }

    // проверка
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Повторно — не должен добавиться

        set.printAll();

        set.remove("Banana");
        set.printAll(); // Осталось 2 элемента

        System.out.println("Size: " + set.size());
    }
}
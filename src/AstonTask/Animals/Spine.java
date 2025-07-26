package AstonTask.Animals;

public interface Spine {
     default void hasSpine(Animal animal) {
        System.out.println(animal.getType() + " имеет позвоночник");
    };
}

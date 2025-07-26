package AstonTask.Animals;

public interface Water {
     default void livesInWater(Animal animal) {
        System.out.println(animal.getType() + " обитает в воде");
    };
}

package AstonTask.Animals;

public class Zoo {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.describeFur();
        bear.hasSpine(bear);

        Cat cat = new Cat();
        cat.describeFur();
        cat.hasSpine(cat);

        Fish fish = new Fish();
        fish.livesInWater(fish);

        Whale whale = new Whale();
        whale.livesInWater(whale);
        whale.hasSpine(whale);
    }
}

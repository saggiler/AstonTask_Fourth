package AstonTask.Animals;

public class Fish extends Animal implements Water{
    @Override
    public String getType() {
        return "Рыба";
    }
}

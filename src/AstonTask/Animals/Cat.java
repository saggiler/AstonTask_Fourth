package AstonTask.Animals;

public class Cat extends Mammal implements HasFur{
    @Override
    public void describeFur() {
        System.out.println("У кошки блестящая и шелковистая шерсть");
    }

    @Override
    public String getType() {
        return "Кошка ";
    }
}

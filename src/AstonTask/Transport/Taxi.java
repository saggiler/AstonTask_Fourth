package AstonTask.Transport;

public class Taxi extends Transport implements Wheel{
    @Override
    public void move() {
        System.out.println("Такси ездит");
    }

    @Override
    public void hasWheels() {
        System.out.println("Такси имеет колёса");
    }
}

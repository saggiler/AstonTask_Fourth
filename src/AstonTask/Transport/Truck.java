package AstonTask.Transport;

public class Truck extends Transport implements Wheel, CarriesCargo {
    @Override
    public void move() {
        System.out.println("Грузовик ездит");
    }

    @Override
    public void hasWheels() {
        System.out.println("Грузовик имеет колёса");
    }
}

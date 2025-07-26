package AstonTask.Transport;

public class Helicopter extends Transport implements Wheel, Screw, CarriesCargo  {
    @Override
    public void move() {
        System.out.println("Вертолёт летает");
    }

    @Override
    public void hasScrew() {
        System.out.println("Вертолёт имеет винт");
    }

    @Override
    public void hasWheels() {
        System.out.println("Вертолёт имеет колеса");
    }
}

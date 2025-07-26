package AstonTask.Transport;

public class Airplane extends Transport implements Wheel, Screw, Wings, CarriesCargo {
    @Override
    public void move() {
        System.out.println("Самолёт летает");
    }

    @Override
    public void hasScrew() {
        System.out.println("Самолёт имеет пропеллеры");
    }

    @Override
    public void hasWheels() {
        System.out.println("Самолёт обладает шасси");
    }

    @Override
    public void hasWings() {
        System.out.println("Самолёт обладает крыльями");
    }
}

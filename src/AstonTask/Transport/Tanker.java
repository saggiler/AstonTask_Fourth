package AstonTask.Transport;

public class Tanker extends Transport implements Screw, CarriesCargo {
    @Override
    public void move() {
        System.out.println("Танкер ходит");
    }

    @Override
    public void hasScrew() {
        System.out.println("Танкер имеет гребные винты");
    }
}

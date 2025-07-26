package AstonTask.Transport;

public class Boat extends Transport implements Screw, CarriesCargo{
    @Override
    public void move() {
        System.out.println("Катер ходит");
    }

    @Override
    public void hasScrew() {
        System.out.println("Катер имеет гребной винт");
    }
}

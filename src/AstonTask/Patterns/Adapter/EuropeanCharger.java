package AstonTask.Patterns.Adapter;

public class EuropeanCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Заряжается европейской зарядкой");
    }
}

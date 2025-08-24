package AstonTask.Patterns.Adapter;

public class AdapterExampleMain {
    public static void main(String[] args) {
        Charger charger = new EuropeanCharger();
        charger.charge();

        // Используем адаптер
        Charger adapter = new SocketAdapter(new AmericanSocket());
        adapter.charge();
    }
}

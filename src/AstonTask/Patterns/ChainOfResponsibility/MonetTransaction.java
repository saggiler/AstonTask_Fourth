package AstonTask.Patterns.ChainOfResponsibility;

public class MonetTransaction {
    private double amount;

    public MonetTransaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

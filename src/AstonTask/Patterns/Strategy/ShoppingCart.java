package AstonTask.Patterns.Strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // метод для выбора стратегии
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // метод для оплаты
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Ошибка: не выбрана стратегия оплаты!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}

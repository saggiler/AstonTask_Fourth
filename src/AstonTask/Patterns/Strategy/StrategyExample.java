package AstonTask.Patterns.Strategy;

public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Используем оплату картой
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-1234-5678"));
        cart.checkout(493);

        // Меняем стратегию на PayPal
        cart.setPaymentStrategy(new PayPalPayment("sag@mail.ru"));
        cart.checkout(700);
    }
}

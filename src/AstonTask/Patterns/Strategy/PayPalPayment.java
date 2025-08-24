package AstonTask.Patterns.Strategy;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " рублей через PayPal аккаунт: " + email);
    }
}

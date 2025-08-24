package AstonTask.Patterns.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " рублей с карты: " + cardNumber);
    }
}

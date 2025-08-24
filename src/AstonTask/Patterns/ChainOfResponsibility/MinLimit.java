package AstonTask.Patterns.ChainOfResponsibility;

public class MinLimit extends ValidateTransaction{
    @Override
    public void check(MonetTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 1000) {
            System.out.println("Необходимо ввести пароль");
        }
        checkNext(moneyTransaction);
    }
}

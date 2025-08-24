package AstonTask.Patterns.ChainOfResponsibility;

public class MaxLimit extends ValidateTransaction {

    @Override
    public void check(MonetTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 10000) {
            System.out.println("Превышен максимальный размер транзакции");
        }
    }
}

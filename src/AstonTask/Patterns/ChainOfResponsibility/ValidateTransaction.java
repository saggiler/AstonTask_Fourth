package AstonTask.Patterns.ChainOfResponsibility;

public abstract class ValidateTransaction {
    private ValidateTransaction next;
        //Метод выполняющий следующую проверку
    public void setNext(ValidateTransaction next) {
        this.next = next;
    }

    public abstract void check(MonetTransaction moneyTransaction);

        //мктод вызывающий валидацию в "следующей проверке"
    protected void checkNext( MonetTransaction moneyTrasaction) {
        if (next != null) {
            next.check(moneyTrasaction);
        }
    }
}

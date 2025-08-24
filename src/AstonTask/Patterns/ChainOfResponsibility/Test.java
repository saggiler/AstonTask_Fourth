package AstonTask.Patterns.ChainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        ValidateTransaction firstValidation = new MinLimit();
        ValidateTransaction secondValidation = new MaxLimit();

        firstValidation.setNext(secondValidation);

        firstValidation.check(new MonetTransaction(14000));
    }
}

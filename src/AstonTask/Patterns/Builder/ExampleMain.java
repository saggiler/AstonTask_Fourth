package AstonTask.Patterns.Builder;

public class ExampleMain {
    public static void main(String[] args) {
        Burger burger =  new Burger.BurgerBuilder()
                .setBread("Bun")
                .setMeat("Beef")
                .setCheese("Cheddar")
                .setSauce("BBQ")
                .build();

        System.out.println(burger);
    }
}

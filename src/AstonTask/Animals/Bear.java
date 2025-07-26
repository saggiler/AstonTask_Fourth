package AstonTask.Animals;

public class Bear extends Mammal implements HasFur{
    @Override
    public void describeFur() {
        System.out.println("У медведя густая, грубая и довольно длинная шерсть с густым подшерстком.");
    }

    @Override
    public String getType() {
        return "Медведь";
    }
}

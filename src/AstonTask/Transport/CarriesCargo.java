package AstonTask.Transport;

public interface CarriesCargo {
    default void carriesCargo() {
        System.out.println("Это средство транспортирует грузы");
    };
}

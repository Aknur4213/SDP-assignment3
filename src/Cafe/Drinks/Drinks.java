package Cafe.Drinks;

public interface Drinks {
    public default void drinking() {
        System.out.println(" a drink");
    }
}

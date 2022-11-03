package days70_Review;

public interface IUcabilir {

    void fly();

    default void run() {
        System.out.println("Kos");
    }
}

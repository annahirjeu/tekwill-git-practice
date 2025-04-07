package vehicles;

public interface OldVehicles {

    void start();

    void run();

    default void wash(int time) {
        System.out.println("Vehicle was washed in: " + time);
    }
}

package vehicles;

public interface NewVehicles {


    void start();

    void run();

    default void wash(int time) {
        System.out.println("Vehicle was washed in: " + time);
    }

    static void somethingStatic() {

    }
}

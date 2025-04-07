package vehicles;

public interface Vehicle extends NewVehicles, OldVehicles {

    int numberOfRides = 50;


    @Override
    default void wash(int time) {
        OldVehicles.super.wash(time);
    }

    static void somethingStatic() {

    }

    void getGaz();

}

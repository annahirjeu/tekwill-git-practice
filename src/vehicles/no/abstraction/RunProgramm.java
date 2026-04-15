package vehicles.no.abstraction;

public class RunProgramm {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.startEngine();
        car.move();

        bicycle.startPedaling();
        bicycle.ride();

        Object[] vehicles = new Object[3];
        vehicles[0] = car;
        vehicles[1] = bicycle;
        startVehicle(car);
        startVehicle(bicycle);
    }

    static void startVehicle(Object vehicle) {
        if (vehicle instanceof Car) {
            ((Car) vehicle).startEngine();
            ((Car) vehicle).move();
        } else if (vehicle instanceof Bicycle) {
            ((Bicycle) vehicle).startPedaling();
            ((Bicycle) vehicle).ride();
        }
    }
}

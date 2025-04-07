package vehicles;

public class RunProgram {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        Car car1 = new Car();
        car1.wash(15);

        car.wash(12);

        Vehicle.somethingStatic();
        NewVehicles.somethingStatic();

        car.start();
        car.run();

        car.wash(15);

        bicycle.start();
        bicycle.run();

        bicycle.wash(15);

        startVehicle(car);
        startVehicle(bicycle);

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = car;
        vehicles[1] = bicycle;

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.run();
        }
    }

    static void startVehicle(Vehicle vehicle) {
        vehicle.run();
        vehicle.start();
    }
}

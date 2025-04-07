package vehicles;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("It has: " + Vehicle.numberOfRides);
        System.out.println("Start pedaling");
    }

    @Override
    public void run() {
        System.out.println("Is ridding");
    }

    @Override
    public void getGaz() {
        
    }
}

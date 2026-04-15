package vehicles;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("It has: ");
        System.out.println("Start engine");
    }

    @Override
    public void run() {
        System.out.println("Car is driving");
    }

    public void wash(int min) {
        System.out.println("Car is washed");
    }

    @Override
    public void getGaz() {

    }

}

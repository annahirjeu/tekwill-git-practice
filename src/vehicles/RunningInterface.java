package vehicles;

public interface RunningInterface {
    Vehicle getVehicleBySomething();

    long getMiles();

    default void doSomething(){
        System.out.println("Doing in interface");
    }

    static void staticMethod(){
        System.out.println("Static In interface");
    }
}

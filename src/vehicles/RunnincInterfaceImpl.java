package vehicles;

public class RunnincInterfaceImpl implements RunningInterface {
    @Override
    public Car getVehicleBySomething() {
        return null;
    }

    @Override
    public long getMiles() {
        return 0;
    }

    @Override
    public void doSomething() {
        System.out.println("In child class");
        RunningInterface.staticMethod();
        RunnincInterfaceImpl.staticMethod();

        RunnincInterfaceImpl runnincInterface= new RunnincInterfaceImpl();
        runnincInterface.staticMethod();
    }

    static void staticMethod(){
        System.out.println("Static In class");
    }
}

import test.MobileAppExpert;

public abstract class Employee implements MobileAppExpert {
    @Override
    public void doingSomethingWithMobile() {
        System.out.println("Programmer expert in  mobile");
    }
}

package payments.with_oop;

public abstract class PaymentAbstract {
    protected double amount;

    protected PaymentAbstract(double amount) {
        this.amount = amount;
    }

    public void initializePayment() {
        System.out.println("Initialize payment details");
    }

    public abstract void completePayment();

}

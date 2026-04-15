package payments.with_oop;

public class VisaPayment extends PaymentAbstract implements AdditionalVerification {
    protected VisaPayment(double amount) {
        super(amount);
    }

    @Override
    public void completePayment() {
        confirmYourIdentity();
        initializePayment();
        System.out.println("Connect to bank API and execute the payment of " + amount + " EUR");
    }

    @Override
    public void confirmYourIdentity() {
        System.out.println("Authorize from bank application");
    }
}

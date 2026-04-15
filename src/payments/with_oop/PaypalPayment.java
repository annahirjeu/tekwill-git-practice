package payments.with_oop;

public class PaypalPayment extends PaymentAbstract implements ExistingAccount {
    protected PaypalPayment(double amount) {
        super(amount);
    }

    @Override
    public void completePayment() {
        createAccount();
        initializePayment();
        System.out.println("Connect to paypal API and execute the payment " + amount + " EUR");
    }

    @Override
    public void createAccount() {
        System.out.println("Go to Paypal site and create account");
    }
}

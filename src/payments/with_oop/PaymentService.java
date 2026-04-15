package payments.with_oop;


public class PaymentService {
    public static void main(String[] args) {
        Store store = new Store();
        double amount = 250.5;
        PaymentAbstract paymentAbstract = store.payForOrder("PayPal", amount);
        if (paymentAbstract != null)
            paymentAbstract.completePayment();

        ExistingAccount existingAccount = store.payForOrderFromAccounts("PayPal", amount);
        existingAccount.createAccount();


    }
}

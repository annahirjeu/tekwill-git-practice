package payment.methods;

public class TransferBancar implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with bank trasfer");
        calculateNrOfPayments();
    }

}

package payments.with_oop;

public class Store {
    public PaymentAbstract payForOrder(String payerPaymentType, double amount) {
        PaymentAbstract paymentAbstract = null;
        switch (payerPaymentType) {
            case "PayPal":
                paymentAbstract = new PaypalPayment(amount);
                break;
            case "Visa":
                paymentAbstract = new VisaPayment(amount);
                break;
            case "BankTransfer":
                paymentAbstract = new BankTransferPayment(amount);
                break;
            case "Stripe":
                paymentAbstract = new StripePayment(amount);
                break;
            default:
                System.out.println("Not a valid payment type");
        }
        return paymentAbstract;
    }

    public ExistingAccount payForOrderFromAccounts(String payerPaymentType, double amount) {
        if (payerPaymentType.equals("PayPal")) {
            return new PaypalPayment(amount);
        } else if (payerPaymentType.equals("Stripe")) {
            return new StripePayment(amount);
        }
        return null;
    }
}

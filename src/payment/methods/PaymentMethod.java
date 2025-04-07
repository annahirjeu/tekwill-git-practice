package payment.methods;

interface PaymentMethod {
    void pay();

    default void calculateNrOfPayments() {
        System.out.println("Calculating nr of payments)");
    }

    static void calculateStatistics() {

    }
}

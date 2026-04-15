package exceptions.bank.account;

public class BankServices {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount(1000.5);
            bankAccount.deposit(500);
            bankAccount.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exceptia: " + e.getMessage());
        }
        try {
            BankAccount anotherBankCount = new BankAccount(-500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceptia in timpul crearii contului bancar: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            BankAccount bankAccount = null;
            System.out.println("Balanta contului este: " + bankAccount.getBalance());
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("something went wrong");
        }
        System.out.println("kjshfkjhdkj");

    }
}

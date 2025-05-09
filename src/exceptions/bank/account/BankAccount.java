package exceptions.bank.account;

public class BankAccount {
    private Double balance;

    public BankAccount(Double initialBalance) {
        if (initialBalance == null || initialBalance < 0) {
            throw new IllegalArgumentException("Soldul initial trebuie sa fie o valoare pozitiva!");
        } else {
            this.balance = initialBalance;
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Suma de depus trebuie sa fie pozitiva si mai mare ca 0!");
        } else {
            balance += amount;
            System.out.println("Ai depus " + amount + " in cont");
        }

/*        if (amount > 0) {
            balance += amount;
            System.out.println("Ai depus " + amount + " in cont");
        } else {
            throw new IllegalArgumentException("Suma de depus trebuie sa fie pozitiva si mai mare ca 0!");
        }*/
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Initiata retragerea de " + amount + " lei -> Sold insuficient pentru a efectua retragerea");
        } else {
            balance -= amount;
            System.out.println("Ai retras: " + amount + ". Suma ramasa este: " + balance);
        }
    }
}

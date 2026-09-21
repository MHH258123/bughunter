public class ManageAccount {

    public int withdrawal;
    public int deposit;
    double balance = 1000;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            balance = balance - amount;
        } else {
            IO.println("No money");
        }
    }
    public String toString(){
        return String.format("""
                Indsat: %d
                Trukket: %d
                Balance: %d kr:
                """, deposit, withdrawal, balance);
    }
}


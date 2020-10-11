package BankAbstract;

public abstract class BankAccount {

    private String accountNumber;
    private float balance;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount){
        balance = balance + amount;
    }

    public abstract boolean withdraw(float amount);
}

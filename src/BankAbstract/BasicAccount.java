package BankAbstract;

public class BasicAccount extends BankAccount{


    public BasicAccount(String accountNumber, float balance){
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    @Override
    public boolean withdraw(float amount) {
        if(getBalance() >= amount){
            setBalance(getBalance()-amount);
               return true;
        }
        return false;
    }
}

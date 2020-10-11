package BankAbstract;

public class GoldAccount extends BankAccount{

    private float minimum;

    public GoldAccount(String accountNumber, float balance, float minimum){
        setAccountNumber(accountNumber);
        setBalance(balance);
        this.minimum = minimum;
    }
    @Override
    public boolean withdraw(float amount) {
        if(getBalance() >= amount){
            if(getBalance()-amount < minimum){
                return false;
            }
            setBalance(getBalance()-amount);
            return true;
        }
        return false;
    }
}

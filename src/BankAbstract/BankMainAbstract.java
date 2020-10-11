package BankAbstract;

public class BankMainAbstract {

    public static void main(String [] args){
        BankAccount account = new BasicAccount("DA", 1000);
        BankAccount account1 = new GoldAccount("DA", 1000, 200);
    }
}

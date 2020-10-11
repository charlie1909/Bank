public class Bank {

    public static void main(String [] args){
        BasicAccount account1 = new BasicAccount("DA1", 1000);
        GoldAccount account2 = new GoldAccount("DA2", 1000, 200);

        try{
            account1.setAccountNumber(null);
        }catch(IllegalArgumentException e){
            System.out.println("Account number is null");
        }
        System.out.println(account1.withdraw(805));
        System.out.println(account2.withdraw(805));

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}

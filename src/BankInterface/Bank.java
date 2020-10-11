package BankInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bank {

    BankAccount[] accounts = new BankAccount[5];

    List<BankAccount> accountsList = new ArrayList<>();

    public void populate(){
        BankAccount account1 = new BasicAccount("DA1", 1000);
        BankAccount account2 = new GoldAccount("GA2", 2000, 200);

        //adding to array
        // two accounts have now been added to position 0 and 1 in the array.
        accounts[0] = account1;
        accounts[1] = account2;

        //this functions sorts array in descending order
        //collections package can offer array of functions, such as reverse order of results e.g. descending to ascending
        Arrays.sort(accounts, Collections.reverseOrder());

        //adding to array list, automatically adds value to end
        // you don't need to specify what size it is. It will dynamically allocate it no
        //matter how many objects you put inside it.
        accountsList.add(account1);
        accountsList.add(account2);

        //we use collections package and put list we want to sort
        //then specify the comparator which is how entries will be sorted.
        //Also we can put in a specific comparator, which is something
        //that you can define yourself or something that you can usually find online if
        //you have something specific there
        Collections.sort(accountsList, Collections.reverseOrder());

    }
}

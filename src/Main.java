import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[]){
        ArrayList<BankAccount> myAccountList = new ArrayList<BankAccount>();
        myAccountList.add(new BankAccount(586925, "Ahmet", 9848.15));
        myAccountList.add(new BankAccount(264858, "Zeynep", 3847.75));
        myAccountList.add(new BankAccount(984472, "Mehmet", 2826.25));
        myAccountList.add(new BankAccount(647395, "Fatma", 4984.50));

        for(BankAccount account : myAccountList) {
            System.out.println("Account Number: " + account.accountNo + ", Holder Name: " + account.holderName + ", Account Balance: " + account.balance);
        }

        System.out.println("All balances will be reduced by 500 for all accounts!");

        Collections.sort(myAccountList);
        
        for(BankAccount account : myAccountList) {
            account.balanceChange(500);
            System.out.println("Account Number: " + account.accountNo + ", Holder Name: " + account.holderName + ", Account Balance: " + account.balance);
        }
    }
}
package atm;
/*
*in real read from data base file 
*then store accounts in array of type static account
*/
import java.util.Stack;

public class AccountHandel {
    private static Accounts account1 = new Accounts();
    private static String [] history_Array = new String[5];
    private static int counter = -1;
    private static int visiblecounter = 0;
    
    public AccountHandel(){
        account1.setId(5584);
        for(int i = 0 ; i<5; i++)
            history_Array[i] = "No Action";
    }
    
    public void deposit(int amount){
        account1.credit(amount);
        history_Array[++counter%5] = ("Deposit : " + amount);
        visiblecounter = counter+1;
    }
    
    public void withdraw(int amount){
        account1.debit(amount);
        history_Array[++counter%5] = ("Withdraw : " + amount);
        visiblecounter = counter+1;
    }
    
    public int balanceinequity(){
        history_Array[++counter%5] = ("Balance : " + account1.getBalance());
        visiblecounter = counter+1;
        return account1.getBalance();
    }
    
    public String  getOldHistoryBack(){
        if(visiblecounter==counter-4){
            visiblecounter--;
            return "No Action";
        }
        if(visiblecounter<counter-4)
            return "No Action";
        if(visiblecounter>counter-4)
            return history_Array[--visiblecounter%5];
        return "Errrrrrror Back";
    }
    
    public String  getOldHistoryFor(){
        if(visiblecounter==counter){
            visiblecounter++;
            return "No Action";
        }
        if(visiblecounter>counter)
            return "No Action";
        if(visiblecounter<counter)
            return history_Array[++visiblecounter%5];
        return "Errrrrrror For";
    }
    
    public void withoutChangeHistory(){
        visiblecounter = counter+1;
    }
    public int withdrawCheck(){
        return account1.getBalance();
    }
}

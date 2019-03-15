package atm;


public class Accounts {
    private int balance = 0;
    private int id;
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void credit(int amount){
        balance = balance + amount;
    }

    public void debit(int amount){
        balance = balance - amount;
    }

    public int getBalance(){
        return balance;
    }
    
    

}

package assignment;

public class Account {
    String id;
    String name;
    double balance;

    public Account(){}
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(int amount){

        if(amount >=0){
            this.setBalance(this.balance + amount);
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void debit(int amount){
        Account user = new Account();
        if(amount >=0){
            user.setBalance(this.balance - amount);
        }else{
            System.out.println("Invalid amount");
        }
    }


    public void transferTo(Account user2,int amount){

        if(amount >=0 && this.balance>amount){
            this.setBalance(this.balance - amount);
            user2.setBalance(this.balance + amount);
        }else{
            System.out.println("Cannot make Transaction: not enough money left");
        }
    }
}

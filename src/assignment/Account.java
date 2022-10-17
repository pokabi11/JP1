package assignment;

public class Account {
    private Integer id;
    private String name;
    private double balance;

    public Account(){}
    public Account(Integer id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
//setter getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

//        setBalance(getBalance()+(amount>0?amount:0));

        if(amount >=0){
            this.setBalance(this.balance + amount);
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void debit(int amount){



        if(amount >=0){
            this.setBalance(this.balance - amount);
        }else{
            System.out.println("Invalid amount");
        }
    }


    public void transferTo(Account user2,int amount){

        if(amount >=0 && this.balance>amount){
            this.debit(amount);
            user2.credit(amount);
        }else{
            System.out.println("Cannot make Transaction: not enough money left");
        }
    }
}

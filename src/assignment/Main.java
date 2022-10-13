package assignment;

public class Main {
    public static void main(String[] args){
//        Fraction t1 = new Fraction(1,2);
//        Fraction t2 = new Fraction(3,4);
//        Fraction t = t1.add(t2);
//        Fraction tt = t2.add(t1);
//        Fraction ttt = t.add(tt);

        Account user = new Account("a1","abc xyz",100);
        Account user2 = new Account("b1","aaa zzz",100);

        user.credit(100);

        user.transferTo(user2,20);
        System.out.println(user.getBalance());
        System.out.println(user2.getBalance());
    }
}

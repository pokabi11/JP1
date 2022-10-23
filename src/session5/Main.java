package session5;

import javax.swing.text.Style;

public class Main {
    public static void main(String[] args){
        try {
            int a=10;
            int b=0;
            if(a>5){
                throw new Exception("số to quá k chia đc");
            }
            int c=a/b;
            System.out.println("c = "+c);
        }catch (ArithmeticException e){                             //arithmeticException < Exception
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //catch hay k catch thì flow vẫn chạy qua đây.
        }
    }
}

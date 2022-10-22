package session5;

import javax.swing.text.Style;

public class Main {
    public static void main(String[] args){
        try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("c = "+c);
        }catch (ArithmeticException e){                             //arithmeticException < Exception
            System.out.println("Arithmetic Errors nay fix de");
        }catch (Exception e){
            System.out.println("Errors nay fix di");
        }finally {
            //catch hay k catch thì flow vẫn chạy qua đây.
        }
    }
}

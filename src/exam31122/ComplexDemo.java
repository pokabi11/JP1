package exam31122;

import java.util.Scanner;

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex mainComplex = new Complex(3.0,4.5);
        Complex inputComplex = new Complex();
        inputComplex.inputNumber(sc);
//        System.out.print(inputComplex.toString());
        System.out.println(mainComplex.add(inputComplex));
        System.out.println(mainComplex.subtract(inputComplex));
        System.out.println(mainComplex.multiply(inputComplex));
        System.out.println(mainComplex.divide(inputComplex));

    }
}

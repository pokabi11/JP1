package exam31122;

import java.util.Scanner;

public class Complex {
    private double realPart,imaginaryPart;

    public Complex(){
        this.realPart=0;
        this.imaginaryPart=0;
    }
    public Complex(double realPart, double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void inputNumber(Scanner sc) {
        System.out.print("Set realPart: \n");
        realPart = sc.nextDouble();

        System.out.print("Set imaginaryPart: \n");
        imaginaryPart = sc.nextDouble();
    }
    public Complex add (Complex otherNumber){
        double sumRealPart = getRealPart() + otherNumber.getRealPart();
        double sumImaginaryPart = getImaginaryPart() + otherNumber.getImaginaryPart();
        return new Complex(sumRealPart, sumImaginaryPart);
    }
    public Complex subtract (Complex otherNumber){
        double subtractRealPart = getRealPart() - otherNumber.getRealPart();
        double subtractImaginaryPart = getImaginaryPart() - otherNumber.getImaginaryPart();
        return new Complex(subtractRealPart, subtractImaginaryPart);
    }
    public Complex multiply (Complex otherNumber){
        double multiplyRealPart = getRealPart() * otherNumber.getRealPart() - getImaginaryPart() * otherNumber.getImaginaryPart();
        double multiplyImaginaryPart = getImaginaryPart() + otherNumber.getImaginaryPart();
        return new Complex(multiplyRealPart, multiplyImaginaryPart);
    }
    public Complex divide (Complex otherNumber){
        double divideRealPart = (getRealPart() * otherNumber.getRealPart() + getImaginaryPart() * otherNumber.getImaginaryPart()) / (otherNumber.getRealPart() * otherNumber.getRealPart() + otherNumber.getImaginaryPart() * otherNumber.getImaginaryPart());
        double divideImaginaryPart = (otherNumber.getRealPart() * getImaginaryPart() - getRealPart() * otherNumber.getImaginaryPart()) / (otherNumber.getRealPart() * otherNumber.getRealPart() + otherNumber.getImaginaryPart() * otherNumber.getImaginaryPart());
        return new Complex(divideRealPart, divideImaginaryPart);
    }
    public String toString() {
        String ifMinusImaginaryPart = getImaginaryPart() < 0 ? " - " : " + " ;
        return "Complete process. Result is: " + getRealPart() + ifMinusImaginaryPart + Math.abs(getImaginaryPart()) + "i";
    }
}

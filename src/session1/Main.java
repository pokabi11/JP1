package session1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
//==========================================
        int x=10; //tạo ra có ô nhớ mặc định
        Student s = new Student();
        s = new Student(); //đây là 1 đối tượng
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 21;

        s.showInfo();
        s2.showInfo();

        Student[] s3 = new Student[6];
        s3[0] = new Student();
        s3[0].name= "Test";
        s3[0].age= 555;
        s3[0].showInfo();
//==========================================
        Scanner sc = new Scanner(System.in);
        Triangle abc = new Triangle();
        System.out.println("Nhập cạnh thứ 1:");
        abc.setVar1(sc.nextInt());
        System.out.println("Nhập cạnh thứ 2:");
        abc.setVar2(sc.nextInt());
        System.out.println("Nhập cạnh thứ 3:");
        abc.setVar(sc.nextInt());

        abc.outputchuvi();
        abc.outputdientich();
    }
}

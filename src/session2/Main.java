package session2;

import session1.Student;
public class Main {
    public static void main(String[] args){
        Student t = new Student();
        t.name = "Eula";

        FptStudent ft = new FptStudent();
        ft.run();
        ft.run(10);
        ft.run(10,"Hello");

        FptStudent ft1 = new FptStudent("Stu 1");
        FptStudent ft2 = new FptStudent("idStu123","Name123","0123456789");
    }
}

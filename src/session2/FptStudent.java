package session2;

import session1.Student;

import java.util.ArrayList;

public class FptStudent {
    String Code;
    String name;
    String tel;
    ArrayList<String> paymentMethods = new ArrayList<>();
    private int Mark;

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public FptStudent(){
        System.out.println("FPTStu");
    }

    public FptStudent(String testName){
        System.out.println("FPTStu");
    }

    public FptStudent(String code, String name, String tel) {
        Code = code;
        this.name = name;
        this.tel = tel;
    }

    public void run(){
        System.out.println("Print SUPERclass content");
    }
    public void run (int x){
        System.out.println("Print SUPERclass 123 content");
    }
    public void run (int x, String H){
        System.out.println("Print SUPERclass xyz content");
    }
}

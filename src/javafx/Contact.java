package javafx;

public class Contact {
    private String name;
    private String email;
    private String address;
    private String age;
    private String tel;

    public Contact(String name, String email, String address, String age, String tel){
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.tel = tel;
    }

    public String toString(){
        return this.name+"--"+this.email+"--"+this.address+"--"+this.age+"--"+this.tel;
    }

}

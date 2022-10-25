package assignment;

public class assdfk {
    private String name;
    private String email;
    private String score;

    public Student(String name, String email, String score){
        this.name =name;
        this.email=email;
        this.score=score;
    }
    public String toString(){
        return this.name + this.email + this.score;
    }
}

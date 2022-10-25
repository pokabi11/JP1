package javafx;

public class Assdfk {
    private String name;
    private String email;
    private Integer score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Assdfk(String name, String email, Integer score){
        this.name =name;
        this.email=email;
        this.score=score;
    }
    public String toString(){
        return this.name + this.email + this.score;
    }
}

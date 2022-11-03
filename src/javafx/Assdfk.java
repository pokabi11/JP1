package javafx;

import javafx.edit.EditController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Assdfk {
    private Integer id;
    private String name;
    private String email;
    private Integer score;
    private String gender;

    private Button edit;

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Assdfk(Integer id,String name, String email, Integer score, String gender){
        this.id=id;
        this.name =name;
        this.email=email;
        this.score=score;
        this.gender=gender;
        this.edit= new Button("Button");
        this.edit.setOnAction(event -> {
            try{
                EditController.editedStudent =this;
                EditController.id =this.id;
                Parent editForm = FXMLLoader.load(getClass().getResource("edit/edit.fxml"));
                Scene sc = new Scene(editForm,800,600);
                Main.rootStage.setScene(sc);
            }catch (Exception e) {

            }
        });
    }
    public String toString(){
        return this.name + this.email + this.score;
    }
}

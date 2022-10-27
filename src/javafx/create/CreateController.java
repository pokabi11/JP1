package javafx.create;

import javafx.Main;
import javafx.Assdfk;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class CreateController {
    public static Assdfk editedStudent;
    public TextField txtName;

    public void backToList(ActionEvent event) throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit(ActionEvent event) throws Exception{
        
        // them sv
        // xong
        backToList(null);
    }
}
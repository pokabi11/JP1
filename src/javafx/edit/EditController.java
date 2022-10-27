package javafx.edit;

import javafx.Assdfk;
import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class EditController {
    public static Assdfk editAssdfk;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtScore;

    public void backToList(ActionEvent event) throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit (ActionEvent event) throws Exception{
        //them du lieu
        backToList(null);
    }
}

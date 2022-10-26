package javafx.list;

import javafx.Main;
import javafx.Assdfk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.create.CreateController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

public class ListController {
    public ListView<Assdfk> lv;

    public static ObservableList<Assdfk> ls = FXCollections.observableArrayList();

    public void createStudent(ActionEvent event) throws Exception{
        Parent createForm = FXMLLoader.load(getClass().getResource("../create/create.fxml"));
        Scene sc = new Scene(createForm,800,600);
        Main.rootStage.setScene(sc);
    }

    public void edit() {
        CreateController.editedAssdfk = lv.getSelectionModel().getSelectedItem();

    }
}
package javafx.edit;

import javafx.Main;
import javafx.Assdfk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.list.ListController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;

public class EditController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtScore;
    public ComboBox<String> cbGender;

    public static Assdfk editedStudent;
    public static Integer id;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtName.setText(editedStudent.getName());
        txtEmail.setText(editedStudent.getEmail());
        txtScore.setText(editedStudent.getScore().toString());
        ObservableList<String> genders = FXCollections.observableArrayList();
        genders.add("Nam");
        genders.add("Nữ");
        genders.add("Khác");
        cbGender.setItems(genders);
        cbGender.setValue(editedStudent.getGender());
    }

    public void backToList(ActionEvent event) throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit(ActionEvent actionEvent) {
        try {
            Integer m = Integer.parseInt(txtScore.getText());
            if(m<0 || m > 10)
                throw new Exception("Điểm thi không hợp lệ");
            // them sv
            Assdfk a=  new Assdfk(null,txtName.getText(),txtEmail.getText(),m,cbGender.getValue());
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(ListController.connectionString,ListController.user,ListController.pwd);
            Statement stt = conn.createStatement();
            String sql_txt = "update students set name='"
                    +txtName.getText()+"',email='"
                    +txtEmail.getText()+"',score="
                    +m
                    +", gender='"+cbGender.getValue()+"' where id ="
                    +id+""
                    ;
//            String sq=String.format("update students set name='%s',email='%s',score=%d,gender='%s' where id=%d",txtName.getText(),txtEmail.getText(),m,cbGender.getValue(),id);
            stt.executeUpdate(sql_txt);
            // xong
            backToList(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}
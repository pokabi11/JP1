package javafx.list;

import javafx.Main;
import javafx.Assdfk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.create.CreateController;
import javafx.edit.EditController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.sql.*;

public class ListController implements Initializable {
    public ListView<Assdfk> lv;

    public ObservableList<Assdfk> ls = FXCollections.observableArrayList(
    );
    public TableView<Assdfk> tvStudents;
    public TableColumn<Assdfk, String> cName;
    public TableColumn<Assdfk, String> cEmail;
    public TableColumn<Assdfk, String> cScore;
    public TableColumn<Assdfk, String> cGender;
    public TableColumn<Assdfk, Button> cAction;
    public TextField txtSearch;
    private boolean sortName = true;

    //=====================
    public final static String connectionString = "jdbc:mysql://pokabi.tech:3306/t2204m";
    public final static String user = "admin_edit";
    public final static String pwd = "adminedit";
    //=====================

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        cEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        cScore.setCellValueFactory(new PropertyValueFactory<>("Score"));
        cGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        cAction.setCellValueFactory(new PropertyValueFactory<>("Edit"));

        //==================
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,pwd);
            Statement stt = conn.createStatement();
            String sql_txt = "select * from students";
            ResultSet rs = stt.executeQuery(sql_txt);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int score = rs.getInt("score");
                String gender = rs.getString("gender");
                Assdfk s = new Assdfk(id,name,email,score,gender);
                ls.add(s);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //==================

//        if (ls.size() == 0) {
//            ls.add(new Assdfk(1,"Nguyễn Hoàng Long", "nhl@gmail.com", 2, "Nam"));
//            ls.add(new Assdfk(2,"Elie", "elie@gmail.com", 3, "Nữ"));
//            ls.add(new Assdfk(3,"Linda", "linddda1@gmail.com", 10, "Nữ"));
//            ls.add(new Assdfk(4,"Lamda", "lammmda2@gmail.com", 9, "Nam"));
//        }


        tvStudents.setItems(ls);
        onSearch();
    }

    public void createStudent(ActionEvent event) throws Exception {
        Parent createForm = FXMLLoader.load(getClass().getResource("../create/create.fxml"));
        Scene sc = new Scene(createForm, 800, 600);
        Main.rootStage.setScene(sc);
    }

    public void edit() {
        try {
            if (lv.getSelectionModel().getSelectedItem() == null) {
                throw new Exception("Vui lòng chọn sinh viên muốn sửa!");
            }
            EditController.editedStudent = tvStudents.getSelectionModel().getSelectedItem();
            Parent editForm = FXMLLoader.load(getClass().getResource("../edit/edit.fxml"));
            Scene sc = new Scene(editForm, 800, 600);
            Main.rootStage.setScene(sc);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    }

    public void search(ActionEvent event) {
        try {
            String s = txtSearch.getText();
            if (s.isEmpty()) {
                tvStudents.setItems(ls);
                throw new Exception("Vui lòng nhập từ cần tìm kiếm");
            }
            ObservableList<Assdfk> results = ls.stream()
                    .filter(student -> student.getName().toLowerCase().contains(s.toLowerCase()))
                    .collect(Collectors.toCollection(FXCollections::observableArrayList));
            tvStudents.setItems(results);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
        }
    }

    public void onSearch() {
        txtSearch.textProperty().addListener((ob,old,newvl)->{
            try {
                String s = txtSearch.getText();
                if (s.isEmpty()) {
                    tvStudents.setItems(ls);
                    throw new Exception("Vui lòng nhập từ cần tìm kiếm");
                }
                ObservableList<Assdfk> results = ls.stream()
                        .filter(student -> student.getName().toLowerCase().contains(newvl.toLowerCase())
                                || student.getGender().toLowerCase().contains(newvl.toLowerCase())
                                || student.getEmail().toLowerCase().contains(newvl.toLowerCase())
//                                || student.getScore().equals(Integer.parseInt(newvl))
                                )
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                tvStudents.setItems(results);

            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
            }
        });
    }
}
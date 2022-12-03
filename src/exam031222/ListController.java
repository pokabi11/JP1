package exam031222;

import database.Connector;
import javafx.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class ListController implements Initializable {

    public TableView<Book> tbBook;
    public TableColumn<Book,String> cId;
    public TableColumn<Book,String> cTitle;
    public TableColumn<Book,String> cAuthor;
    public TableColumn<Book,Integer> cPrice;
    public Button btnCreate;
    public Button btnSearch;

    public static ObservableList<Book> ls = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Connector cnn = Connector.getInstance();
            String sql = "select * from book";
            ResultSet rs = cnn.query(sql);
            while(rs.next()){
                ls.add(new Book(
                        rs.getString("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("price")
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        cId.setCellValueFactory(new PropertyValueFactory<>("id"));
        cTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        cAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        cPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tbBook.setItems(ls);

    }

    public void createStudent(ActionEvent event) throws Exception{
        Parent createForm = FXMLLoader.load(getClass().getResource("create.fxml"));
        Scene sc = new Scene(createForm,800,600);
        Main.rootStage.setScene(sc);
    }

}
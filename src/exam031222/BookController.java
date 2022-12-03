package exam031222;

import javafx.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import database.*;

import java.io.IOException;

public class BookController {
    public TextField txtId;
    public TextField txtTitle;
    public TextField txtAuthor;
    public TextField txtPrice;
    public ListView<Book> lv;
    ObservableList<Book> bookList = FXCollections.observableArrayList();
    //submit
    public void submit(ActionEvent event) throws Exception {
        Connector cnn = Connector.getInstance();
        for(Book i:bookList){
            String sql = String.format("INSERT INTO 'book' VALUES ('%s','%s','%s',%d)",i.getId(),i.getTitle(),i.getAuthor(),i.getPrice());
            cnn.execute(sql);
        }
    }

    public void add(ActionEvent event) {
        try{
            bookList.add(new Book(txtId.getText(),txtTitle.getText(),txtAuthor.getText(),Integer.parseInt(txtPrice.getText())));
        }catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
        }
    }

    public void showBook(ActionEvent event) throws IOException {
        Parent createForm = FXMLLoader.load(BookController.class.getResource("list.fxml"));
        Scene sc = new Scene(createForm,800,600);
        Main.rootStage.setScene(sc);
    }
}

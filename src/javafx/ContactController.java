package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class ContactController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtTel;

    public ListView<Contact> lv;

    private ObservableList<Contact> ls = FXCollections.observableArrayList();


    private ArrayList<String> ls1 = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle reources) {
        ls.add(new Contact("Nguyen Van A","nva@gmail.com","aaa",18,"123456789"));
        ls.add(new Contact("Nguyen Van B","nvb@gmail.com","aaa",18,"123456789"));
        print();
    }

    public void submit(ActionEvent actionEvent) throws Exception {
        try{
            String name = txtName.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            String tel = txtTel.getText();
            if (age < 0 ) throw new Exception("nhap lai");
            Contact ct = new Contact(name,email,address,age,tel);
            ls.add(ct);
        }
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("loi!");
            alert.setHeaderText(e.getMessage());
            alert.show();

        }
        print();
    }

    public void print(){
        lv.setItems(ls);
    }
}

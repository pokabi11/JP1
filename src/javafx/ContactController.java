package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;


public class ContactController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtTel;

    public ListView<Contact> lv;

    private ObservableList<Contact> ls = FXCollections.observableArrayList();


    private ArrayList<String> ls1 = new ArrayList<>();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String tel = txtTel.getText();
        Contact ct = new Contact(name,email,address,age,tel);
        ls.add(ct);
        print();
    }

    public void print(){
        lv.setItems(ls);
    }
}

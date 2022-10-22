package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ContactController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtTel;
    public Text strName;
    public Text strEmail;
    public Text strAddress;
    public Text strAge;
    public Text strTel;


    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
//        System.out.println("Submitting..."+name);
        strName.setText(name);
        String email = txtEmail.getText();
        strEmail.setText(email);
    }
}

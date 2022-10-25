package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Collections;
import java.util.Comparator;

public class AssdfkController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtScore;
    public ListView<Assdfk> lvStudents;

    ObservableList<Assdfk> ls = FXCollections.observableArrayList();
    private boolean sortName = true;
    private boolean sortScore = true;
    public void submit (ActionEvent event){
        try{
            String name = txtName.getText();
            String email = txtEmail.getText();
            Integer score = Integer.parseInt(txtScore.getText());
            if (score < 0 || score >10)
                throw new Exception("nhap lai");
            ls.add(new Assdfk(name,email,score));
            lvStudents.setItems(ls);
        }catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("loi!");
//            alert.setHeaderText(e.getMessage());
//            alert.show();
            e.printStackTrace();
        }
    }
    public void sortByName(ActionEvent event) {
        Collections.sort(ls, new Comparator<Assdfk>() {
            @Override
            public int compare(Assdfk o1, Assdfk o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        sortName = !sortName;
        lvStudents.refresh();
    }

    public void goToContact(ActionEvent event) throws Exception {
        Parent contactPage = FXMLLoader.load(getClass().getResource("contact.fxmlt"));
        Scene sc = new Scene(contactPage,800,600);
        Main.rootStage.setTitle("Contact JavaFX");
        Main.rootStage.setScene(sc);
    }

    public void sortByScore(ActionEvent event) {
        Collections.sort(ls, new Comparator<Assdfk>() {
            @Override
            public int compare(Assdfk o1, Assdfk o2) {
                return sortScore?o1.getScore().compareTo(o2.getScore()):o2.getScore().compareTo(o1.getScore());
            }
        });
        sortScore = !sortScore;
        lvStudents.refresh();
    }
}

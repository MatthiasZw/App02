package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;



public class Controller {

    @FXML
    private PasswordField name;

    @FXML
    private PasswordField inputpass;

    @FXML
    private Button buttonanmledung;

    @FXML
    private TextArea logintext;

    private String anmeldung() {
        String namee = name.getText();
        String pwd = inputpass.getText();
        if (namee.equals("Rudi")  && pwd.equals("geheim")) {
            return "Erfolgreich";
        }
        return "nicht erfolgreich";
    }



    @FXML
    void onbuttonanmeldung(ActionEvent event) {
        String namee = name.getText();
        logintext.setText(anmeldung());

    }




}


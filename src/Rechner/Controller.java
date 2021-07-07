package Rechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField wert1field;

    @FXML
    private TextField wert2field;

    @FXML
    private Button plusbutton;

    @FXML
    private TextField ergebnisfield;

    private String ergebnis() {
        String wert1 = wert1field.getText();
        String wert2 = wert2field.getText();
       Float wert11 = Float.parseFloat(wert1);
       Float wert22 = Float.parseFloat(wert2);
       Float erg = wert11 + wert22;
       String erg2 = Float.toString(erg);
       return erg2;



    }

    @FXML
    void onplus(ActionEvent event) {
        ergebnisfield.setText(ergebnis());


    }


}

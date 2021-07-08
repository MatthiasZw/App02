package Bindings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
boolean isverbunden=true;
    @FXML
    private Slider sldwert;

    @FXML
    private Slider sld2;

    @FXML
    private Label lblwert;

    @FXML
    private Button btntransfer;

    @FXML
    private ToggleButton tgl;

    @FXML
    void onDraggedwert(MouseEvent event) {

       lblwert.setText(String.format("%.2f", sldwert.getValue()));
    }

    @FXML
    void onsliderwert(ActionEvent event) {
       Double sldVal = sldwert.getValue();
       lblwert.setText(sldVal.toString());


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sld2.valueProperty().bindBidirectional(sldwert.valueProperty());


    }

    @FXML
    void ontgl(ActionEvent event) {

        Double sldVal = sldwert.getValue();
        lblwert.setText(sldVal.toString());
        if (!isverbunden){
            btntransfer.setText("Ungebunden");
        }else {
            //btntransfer.setText("Verbunden");

            sld2.valueProperty().unbindBidirectional(sldwert.valueProperty());
        }
        isverbunden = !isverbunden;
        btntransfer.setText(String.format("%sbunden", isverbunden ? "Ver" : "Unge"));

    }
}

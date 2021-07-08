package Bindings;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {
    @FXML
    private Slider sld1;

    @FXML
    private Slider sld2;

    @FXML
    private Circle krs;


    @FXML
    private TextField txt;

    @FXML
    void ondrag1(MouseEvent event) {

    }

    @FXML
    void ondrag2(MouseEvent event) {

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txt.setEditable(true);
        krs.strokeWidthProperty().bind(sld1.valueProperty());
        krs.radiusProperty().bind(sld2.valueProperty());
        txt.textProperty().bindBidirectional(sld2.valueProperty(), new NumberStringConverter());


    }
}

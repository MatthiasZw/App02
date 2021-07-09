package FXFormattextField;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LocalDateStringConverter;

import javax.swing.*;
import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Stack;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final StringConverter<Integer>  inttostring = new IntegerStringConverter();
        final StringConverter<LocalDate> datetostring = CreateLocalDateConverter();
        final TextField dateTimeText = createDateFormattedTextfield(datetostring);
        final TextField integerText = createIntegerFormattedText(inttostring);

        dateTimeText.setPromptText("Bitte Datum im Format dd.mm.YYYY eingeben");
        integerText.setPromptText("Bitte nur ganze Zahlen");
        VBox root = new VBox(30);
        root.setPadding(new Insets(50));
        root.getChildren().addAll(dateTimeText,integerText);

        Scene scene = new Scene(root,400,200);
        primaryStage.setTitle("Formattextfield");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private StringConverter<LocalDate> CreateLocalDateConverter() {
        return new LocalDateStringConverter(FormatStyle.MEDIUM, Locale.GERMANY, Chronology.ofLocale(Locale.GERMANY));
    }

    private TextField createIntegerFormattedText(StringConverter<?> converter) {
        TextField textField = new TextField();
        textField.setOnAction(event -> checkvalidation(textField, converter));
        return new TextField();
    }

    private TextField createDateFormattedTextfield (StringConverter<LocalDate> datetostring)  {
        TextField txtField = new TextField();
        //txtField.setTextFormatter(new TextFormatter<LocalDate>(datetostring));
        txtField.setOnAction(event -> checkvalidation(txtField, datetostring));
        return txtField;
    }

    private void checkvalidation(TextField txtField, StringConverter<?> converter) {
        try {
           // var input = TextField.getText();
            converter.fromString(txtField.getText());

        } catch (final RuntimeException ex){
            new Alert(Alert.AlertType.ERROR, ex.toString()).showAndWait();

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

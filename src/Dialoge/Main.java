package Dialoge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Optional;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        final Optional<ButtonType> result = showConfirmdialog();
        if (result.isPresent() && result.get() == ButtonType.OK){
            final Optional<String> inputtext= showTextInputdialog();
            System.out.println(inputtext);
            final Optional<String> selection = showActionselection();
            System.out.println("Gewählt wurde " + selection.get());

        }

        System.out.println(result);


    }

    private Optional<String> showActionselection() {
        final ChoiceDialog<String> dialog = new ChoiceDialog<>("hoch", "mittel", "gering");
        dialog.setTitle("Wichtigkeit der Aufgabe");
        dialog.setHeaderText("vbslökdjgäsdl");
        dialog.setContentText("Die Aufgabe hat folgende Wertung ");
        dialog.setGraphic(null);




        return dialog.showAndWait();


    }

    private Optional<String> showTextInputdialog() {
        final TextInputDialog txtDialog= new TextInputDialog("Wie ist Ihr Name?");
        txtDialog.setTitle("Wichtige Info...");
        txtDialog.setHeaderText("Dies ist ein TextDialog ");
        txtDialog.setContentText("Bitte geben Sie Ihren Namen ein");
        txtDialog.setGraphic(new ImageView());


        return txtDialog.showAndWait();

    }

    private Optional<ButtonType> showConfirmdialog() {
        return new Alert(Alert.AlertType.CONFIRMATION, "wollen wir wurst").showAndWait();


    }


    public static void main(String[] args) {


        launch(args);
    }
}

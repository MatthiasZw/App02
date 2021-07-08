package FXListeSearch;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    final String[] names={"Hans","Sepp","Xaver","Hubert","Franz"};

    final ObservableList<String> entries= FXCollections.observableArrayList(names);




    @FXML
    private TextField fieldsearch;

    @FXML
    private Button search;

    @FXML
    private ListView<String> list;

    @FXML
    void onsearch(ActionEvent event) {
        list.


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list.setItems(entries);

        
    }
}

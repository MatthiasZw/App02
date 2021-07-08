package FXListeNewandDelete;

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

    final String[] names={"Hans","Sepp"};

    final ObservableList<String> entries= FXCollections.observableArrayList(names);

    private SelectionModel<String> selected;

    @FXML
    private Button add;

    @FXML
    private TextField field;

    @FXML
    private Button del;

    @FXML
    private ListView<String> list;

    @FXML
    void onadd(ActionEvent event) {
        entries.add(field.getText());
        field.clear();

    }

    @FXML
    void ondel(ActionEvent event) {


 entries.remove(selected.getSelectedIndex());
 selected.clearAndSelect(-1);

    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        add.disableProperty().bind(field.textProperty().isEmpty());

        list.setItems(entries);
        selected=list.getSelectionModel();
       // del.disableProperty().bind(Bindings.isNull(selected.selectedItemProperty()));
        del.disableProperty().bind(selected.selectedItemProperty().isNull());
        
    }
}

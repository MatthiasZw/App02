package lotto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private Button btnstart;

    @FXML
    private ListView<Integer> lstzahlen;

    @FXML
    void onlottostart(ActionEvent event) {
        int [] z = {1,2,3,4,5,6};
        List<Integer> lottolist=new ArrayList<>();
        for (var e:z) {
            lottolist.add(e);
        }
       ObservableList<Integer> olsLotto = FXCollections.observableArrayList(lottolist);
        lstzahlen.setItems(olsLotto);

    }

}

package lotto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.util.*;

public class Controller {
    static final int Max_Anzahl_Zahlen=6;
    Random rnd;
    public Controller(){
        rnd = new Random();
    }

    private Integer[] lottoziehnug(){

        Set<Integer> lottoGenial = new HashSet<>();
        while (lottoGenial.size()<Max_Anzahl_Zahlen) {
            lottoGenial.add(rnd.nextInt(49)+1);

    }

        Integer [] lottoGenialArr=lottoGenial.toArray(new Integer[]{});
        Arrays.sort(lottoGenial.toArray());
        return lottoGenialArr;

    }

    @FXML
    private Button btnstart;

    @FXML
    private Button btnstart2;

    @FXML
    private ListView<Integer> lstzahlen;

    @FXML
    private TextArea txtlottozahlen;

    @FXML
    void onlottostart(ActionEvent event) {

       ObservableList<Integer> olsLotto = FXCollections.observableArrayList(this.lottoziehnug());
        lstzahlen.setItems(olsLotto);

    }
    @FXML
    void onlottostart2(ActionEvent event) {
        String Info= "";

        for(var z:this.lottoziehnug()){

            Info+= "            " + z + "          ";

            txtlottozahlen.setText(Info);
}
    }

}

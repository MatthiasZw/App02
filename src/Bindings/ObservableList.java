package Bindings;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;

public class ObservableList {
    public static void main(String[] args) {
        final String [] standorte = {"EF", "L","Ma"};
        final javafx.collections.ObservableList<String> iad = FXCollections.observableArrayList(standorte);

        final ListChangeListener<String> standortwechsel =(standort) -> meldeWechsel(standort);

        iad.addListener(standortwechsel);
        System.out.println("Neuer Standort");
        aendereStandorte(iad);
        FXCollections.shuffle(iad);
        iad.removeListener(standortwechsel);
        FXCollections.shuffle(iad);
        System.out.println("Ohne Listener" + iad);
    }

    private static void aendereStandorte(javafx.collections.ObservableList<String > iad) {
        iad.add("B");
        iad.add("NDh");
        iad.remove("L");

    }

    private static void meldeWechsel(ListChangeListener.Change<? extends String> standort) {
        System.out.println("Neue Standorte" + standort.getList());
    }
}

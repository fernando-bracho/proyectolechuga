package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;

public class SecondaryController {

    @FXML
    private ComboBox<String> snacksComboBox;

    @FXML
    private Button btnAddSnack;

    public void initialize() {
        snacksComboBox.getItems().addAll("Papas ($20)", "Refresco ($15)", "Chocolate ($25)");
    }

    @FXML
    private void addSnack() {
        String snackSeleccionado = snacksComboBox.getValue();
        if (snackSeleccionado != null) {
            Alert alert = new Alert(AlertType.INFORMATION, "Snack agregado: " + snackSeleccionado);
            alert.show();
        }
    }
}

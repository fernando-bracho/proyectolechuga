package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import java.util.ArrayList;

public class PrimaryController {

    @FXML
    private GridPane gridMesas;

    @FXML
    private Text[] cronometros = new Text[6];

    @FXML
    private ImageView[] imagenesMesas = new ImageView[6];

    private boolean[] estadoMesas = new boolean[6]; // true = ocupada, false = disponible
    private ArrayList<Double>[] costosSnacks = new ArrayList[6]; // Lista de costos de snacks

    public PrimaryController() {
        for (int i = 0; i < 6; i++) {
            costosSnacks[i] = new ArrayList<>();
        }
    }

    @FXML
    public void initialize() {
        for (int i = 0; i < 6; i++) {
            int finalI = i;
            Button btnMesa = new Button("Mesa " + (i + 1));
            btnMesa.setOnAction((ActionEvent event) -> handleMesaClick(finalI));
            gridMesas.add(btnMesa, i % 3, i / 3);
        }
    }

    private void handleMesaClick(int numeroMesa) {
        if (!estadoMesas[numeroMesa]) {
            // Lógica de reserva
            Alert alert = new Alert(AlertType.CONFIRMATION, "¿Deseas reservar la Mesa " + (numeroMesa + 1) + "?");
            alert.showAndWait().ifPresent(response -> {
                if (response.getButtonData().isDefaultButton()) {
                    iniciarMesa(numeroMesa);
                }
            });
        } else {
            // Lógica para opciones de la mesa
            Alert alert = new Alert(AlertType.INFORMATION, "Mesa " + (numeroMesa + 1) + " ocupada");
            alert.show();
        }
    }

    private void iniciarMesa(int numeroMesa) {
        estadoMesas[numeroMesa] = true;
        // Iniciar cronómetro
        // Cambiar imagen a ocupada
    }
}

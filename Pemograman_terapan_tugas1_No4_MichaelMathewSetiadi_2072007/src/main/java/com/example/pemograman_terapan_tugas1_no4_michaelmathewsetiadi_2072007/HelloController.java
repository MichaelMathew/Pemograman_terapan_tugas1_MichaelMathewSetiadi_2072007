package com.example.pemograman_terapan_tugas1_no4_michaelmathewsetiadi_2072007;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class HelloController {
    @FXML
    private Label noAntrian;

    @FXML
    public void entry(ActionEvent ae) {
        String number = noAntrian.getText();
        int nomorAntrian = Integer.parseInt(number);
        nomorAntrian = nomorAntrian + 1;
        noAntrian.setText(String.valueOf(nomorAntrian));
    }

    @FXML
    public void reset(ActionEvent ae) {
        String number = noAntrian.getText();
        int nomorAntrian = Integer.parseInt(number);
        nomorAntrian = 1;
        noAntrian.setText(String.valueOf(nomorAntrian));
    }

}
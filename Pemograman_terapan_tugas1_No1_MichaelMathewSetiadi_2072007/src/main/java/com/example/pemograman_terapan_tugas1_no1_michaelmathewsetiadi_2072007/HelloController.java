package com.example.pemograman_terapan_tugas1_no1_michaelmathewsetiadi_2072007;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField bil1;

    @FXML
    public TextField bil2;

    @FXML
    public TextField hasil;

    @FXML
    public void tambah(){
        String bilangan1 = bil1.getText();
        String bilangan2 = bil2.getText();
        int angka1 = Integer.parseInt(bilangan1);
        int angka2 = Integer.parseInt(bilangan2);
        int penambahan = angka1 + angka2;
        String tambah = String.valueOf(penambahan);
        hasil.setText(tambah);
    }

    @FXML
    public void kurang(){
        String bilangan1 = bil1.getText();
        String bilangan2 = bil2.getText();
        int angka1 = Integer.parseInt(bilangan1);
        int angka2 = Integer.parseInt(bilangan2);
        int pengurangan = angka1 - angka2;
        String kurang = String.valueOf(pengurangan);
        hasil.setText(kurang);
    }

    @FXML
    public void kali(){
        String bilangan1 = bil1.getText();
        String bilangan2 = bil2.getText();
        int angka1 = Integer.parseInt(bilangan1);
        int angka2 = Integer.parseInt(bilangan2);
        int perkalian = angka1 * angka2;
        String kali = String.valueOf(perkalian);
        hasil.setText(kali);
    }

    @FXML
    public void bagi(){
        String bilangan1 = bil1.getText();
        String bilangan2 = bil2.getText();
        int angka1 = Integer.parseInt(bilangan1);
        int angka2 = Integer.parseInt(bilangan2);
        int pembagian = angka1 / angka2;
        String bagi = String.valueOf(pembagian);
        hasil.setText(bagi);
    }
}
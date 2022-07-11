package com.example.pemograman_terapan_tugas1_no2_michaelmathewsetiadi_2072007;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField input;

    public void bilangan (ActionEvent ae) {
        String number = ((Button)ae.getSource()).getText();
        input.setText(input.getText()+number);
    }
    long bilangan1;
    long bilangan2;
    String op = "";
    public void operasi (ActionEvent ae) {

        String operation = ((Button)ae.getSource()).getText();
        if (!operation.equals("=")){
            if(!op.equals("")){
                return;
            }
            op = operation;
            bilangan1 = Long.parseLong(input.getText());
            input.setText("");
        }else {
            if(op.equals("")){
                return;
            }
            bilangan2 = Long.parseLong(input.getText());
            hitung(bilangan1, bilangan2, op);
            op="";
        }
    }

    public void hitung (long n1, long n2, String op){

        switch (op){
            case "C" : input.setText("0");break;
            case "+" : input.setText(n1 + n2 + "");break;
            case "-" : input.setText(n1 - n2 + "");break;
            case "*" : input.setText(n1 * n2 + "");break;
            case "/" :
                if (n2 == 0){
                    input.setText("0");break;
                }
                else {
                    input.setText(n1 / n2 + "");
                    break;
                }
        }
    }
}
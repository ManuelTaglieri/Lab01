package it.polito.tdp.parole;

import it.polito.tdp.parole.model.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextField txtTime;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doInsert(ActionEvent event) {
    	long startTime = System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	long fine = System.nanoTime() - startTime;
    	txtTime.setText(Long.toString(fine));
    	txtResult.clear();
    	for (String s : elenco.getElenco()) {
    		txtResult.appendText(s + "\n");
    	}
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	long startTime = System.nanoTime();
    	elenco.reset();
    	long fine = System.nanoTime() - startTime;
    	txtTime.setText(Long.toString(fine));
    	txtResult.clear();
    	txtParola.clear();
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	long startTime = System.nanoTime();
    	elenco.cancella(txtResult.getSelectedText());
    	long fine = System.nanoTime() - startTime;
    	txtTime.setText(Long.toString(fine));
    	txtResult.clear();
    	for (String s : elenco.getElenco()) {
    		txtResult.appendText(s + "\n");
    	}
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }
}

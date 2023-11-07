package controllers;

import com.israel.ejemplosjar.controladoraccesorio.Controladoraccesorio;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class controladorusuario {

    @FXML
    private Controladoraccesorio cstmAccesorio;

    @FXML
    private TextField tf_cantidad;    
    
    
    @FXML
    void enviaCambioColor(ActionEvent event) {
    	int int_colorCambiado=  Integer.valueOf(tf_cantidad.getText());
    	cstmAccesorio.setColorCambiado(int_colorCambiado);
    }
    
    public void initialize(URL url, ResourceBundle rb) {    
       
    }    
   
}

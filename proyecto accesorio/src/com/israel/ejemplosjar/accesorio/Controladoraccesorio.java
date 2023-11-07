package com.israel.ejemplosjar.accesorio;

import javafx.fxml.FXML;
/**
 * Un controlador para la el componente FXML llamado accesior
 */

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controladoraccesorio extends AnchorPane {
	@FXML
	protected Rectangle rectanguloColoreado;

	@FXML
	protected Label lblPorcentaje;

	/**
	 * Constructor de la clase, asociara su FXML con esta lógica de programa
	 */
	public Controladoraccesorio() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/accesorio.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	/**
	 * En función del numero que se le pase del 1 al 10 cambia a uno de los tres
	 * colores primarios
	 * 
	 * @param numeroDeColor
	 */
	public void setColorCambiado(int numeroDeColor) {
		numeroDeColor = numeroDeColor % 10;

		switch (numeroDeColor) {
		// del 1 al 3 rojo
		case 1:
		case 2:
		case 3:
			rectanguloColoreado.setFill(Color.RED);
			break;
			// del 4 al 7 verde
		case 4:
		case 5:
		case 6:
		case 7:
			rectanguloColoreado.setFill(Color.GREEN);
			break;
			// del 8 al 10 azúl
		case 8:
		case 9:
		case 10:
			rectanguloColoreado.setFill(Color.BLUE);
			break;			// que se quede en negro
		default:
			rectanguloColoreado.setFill(Color.BLACK);

		}
	}

}

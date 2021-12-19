package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	// Janela de aviso que aparece na frente da janela principal
	public static void showAlert(String title, String header, String content, AlertType type) {
		// Instanciado o Alert informando o tipo dele
		Alert alert = new Alert(type);
		// Título 
		alert.setTitle(title);
		// Cabeçalho
		alert.setHeaderText(header);
		// Conteúdo
		alert.setContentText(content);
		// Mostrar alert
		alert.show();
	}
}
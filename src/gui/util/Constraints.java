package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	public static void setTextFieldInteger(TextField txt) {
		// Listener: � uma fun��o para ser executada quando o controle
		// sofrer alguma modifica��o ou intera��o com o usu�rio
		
		// Listener vai controlar o comportamento do nosso controle

		// No addListener ir� ser passado como argumento uma fun��o que ir� ser
		// executada quando o TextField sofrer alguma altera��o. Estamos passando essa
		// fun��o em forma de express�o Lambda, essa express�o Lambda ir� receber 3
		// argumentos, sendo eles:
		// Observable: � uma refer�ncia para controle
		// O valor que o controle tinha antes de voc� mexer nele
		// O valor que o controle ir� ter depois que voc� mexer
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Quando mexermos no controle e gerar um novo valor, iremos fazer uma
			// verifica��o se o valor n�o � nulo e tamb�m se esse novo valor atende a uma
			// express�o regular, por exemplo: Estamos testando se o novo valor � um n�mero
			// inteiro, sendo  a express�o regular de um n�mero inteiro "\\d*" 
			// Se o novo valor n�o for nessa forma, eu vou voltar meu texto para o valor antigo
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Testando o tamanho do novo valor
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Testando se � um tipo double
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}
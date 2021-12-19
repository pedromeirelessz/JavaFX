package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	public static void setTextFieldInteger(TextField txt) {
		// Listener: É uma função para ser executada quando o controle
		// sofrer alguma modificação ou interação com o usuário
		
		// Listener vai controlar o comportamento do nosso controle

		// No addListener irá ser passado como argumento uma função que irá ser
		// executada quando o TextField sofrer alguma alteração. Estamos passando essa
		// função em forma de expressão Lambda, essa expressão Lambda irá receber 3
		// argumentos, sendo eles:
		// Observable: É uma referência para controle
		// O valor que o controle tinha antes de você mexer nele
		// O valor que o controle irá ter depois que você mexer
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			// Quando mexermos no controle e gerar um novo valor, iremos fazer uma
			// verificação se o valor não é nulo e também se esse novo valor atende a uma
			// expressão regular, por exemplo: Estamos testando se o novo valor é um número
			// inteiro, sendo  a expressão regular de um número inteiro "\\d*" 
			// Se o novo valor não for nessa forma, eu vou voltar meu texto para o valor antigo
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
			// Testando se é um tipo double
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}
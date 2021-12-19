package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// Quando o usuário fizer alguma interação com a tela, exemplo: clicar em um botão,
// preencher algum componente... essa ação irá tratada pelo controlador

// Irei usar um padrão quando eu for criar um controlador de uma classe fxml, irei colocar sempre o Controller na frente.
// Por exemplo: Clientes.fxml = ClientesController.java
public class ViewController implements Initializable {

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;

	// Método para ser instanciado quando o botão for clicado
	@FXML
	public void onBTSumAction() {
		try {
			// Uso a operação .getText() para pegar o conteúdo dentro da variável txtNumber,
			// e converto o String que retornar para um tipo Double
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			// Uso a operação .setText para eu colocar um contéudo dentro do label.
			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException N) {
			Alerts.showAlert("Error", "Parse error", N.getMessage(), AlertType.ERROR);
		}
	}

	// Vou colocar aqui dentro ações que serão executadas na hora da instaciação do controlador
	// URL é o caminho da sua tela
	// ResourceBundle são recursos que você pode usar na implementação
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
	}
}

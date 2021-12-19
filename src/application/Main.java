package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Classe b�sica que � uma aplica��o JavaFX. basicamente ela tem que ser uma
// classe que estende de Application
public class Main extends Application {

	// A classe Application tem outros m�todos, como: Init e Stop, no init voc� pode
	// colocar coisas que devem acontecer antes da sua aplica��o iniciar e Stop s�o
	// coisas que voc� quer que aconte�a depois que sua aplica��o encerrar

	// Essa classe tem um m�todo abstrato que � o start, voc� � obrigado a
	// implementar ele.
	@Override
	public void start(Stage stage) {
		try {
			// A tela est� sendo carregada num objeto do tipo Parent, mas no pq arquivo FXML
			// eu uso um AnchorPane e no start instancio com um Parent?. � por que o Parent
			// � uma super classe do AnchorPane
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			// Criando um objeto de cena passando o parent como argumento
			Scene scene = new Scene(parent);
			// Dentro do meu palco, vou ter a cena: "scene" como argumento
			stage.setScene(scene);
			// Mostrar o conte�do do meu palco
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Launch � um m�todo est�tico do applicatio que serve para iniciar a aplica��o
		// JavaFX
		launch(args);
	}
}
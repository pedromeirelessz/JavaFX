package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Classe básica que é uma aplicação JavaFX. basicamente ela tem que ser uma
// classe que estende de Application
public class Main extends Application {

	// A classe Application tem outros métodos, como: Init e Stop, no init você pode
	// colocar coisas que devem acontecer antes da sua aplicação iniciar e Stop são
	// coisas que você quer que aconteça depois que sua aplicação encerrar

	// Essa classe tem um método abstrato que é o start, você é obrigado a
	// implementar ele.
	@Override
	public void start(Stage stage) {
		try {
			// A tela está sendo carregada num objeto do tipo Parent, mas no pq arquivo FXML
			// eu uso um AnchorPane e no start instancio com um Parent?. É por que o Parent
			// é uma super classe do AnchorPane
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			// Criando um objeto de cena passando o parent como argumento
			Scene scene = new Scene(parent);
			// Dentro do meu palco, vou ter a cena: "scene" como argumento
			stage.setScene(scene);
			// Mostrar o conteúdo do meu palco
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Launch é um método estático do applicatio que serve para iniciar a aplicação
		// JavaFX
		launch(args);
	}
}
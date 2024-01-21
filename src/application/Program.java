package application;

import java.io.IOException;
import java.util.Objects;

import gui.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource("/gui/MainView.fxml"));
		ScrollPane scrollPane = fxmlLoader.load();
		scrollPane.setFitToHeight(true);
		scrollPane.setFitToWidth(true);
		Scene scene = new Scene(scrollPane);
		scene.getStylesheets().add(Objects.requireNonNull(this.getClass().getResource("application.css")).toExternalForm());
		Image imagem = new Image("file:///C:\\Users\\Administrator\\Desktop\\banco-digital-javafx-dio-main\\src\\application\\image.png");
		stage.getIcons().add(imagem);
		stage.setTitle("UninterBank");
		stage.setScene(scene);
		fxmlLoader.<MainViewController>getController().setController4(fxmlLoader.getController());
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
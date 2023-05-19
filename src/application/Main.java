package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Main extends Application{
	@Override
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/macroAssist.fxml"));
		stage.setScene(new Scene(root));
		stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
		stage.show();
	}
	
	public static void main(String[] args) throws IOException {
		Application.launch(args);
	}
}

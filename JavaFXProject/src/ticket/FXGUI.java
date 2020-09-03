package ticket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXGUI extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml_gui.fxml"));
    
        Scene scene = new Scene(root, 700, 450);
    
        stage.setTitle("Tickets");
        stage.setScene(scene);
        stage.show();
    
	}

}

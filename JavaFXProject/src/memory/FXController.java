package memory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXController{

	@FXML 
	private ImageView img1;
	
	@FXML private Button kaufBtn;
	public void handleKaufBtnAction(ActionEvent event) {
        System.out.println("button clicked");
    }
	
    public void initialize() throws FileNotFoundException {
    	EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
    	    @Override
    	    public void handle(ActionEvent event) {
    	        kaufBtn.setText("Accepted");
    	        event.consume();
    	    }
    	};
    	kaufBtn.setOnAction(buttonHandler);
    	
    	FileInputStream input = new FileInputStream("src/pics/bild1.png");
	
    	Image image = new Image(input);
    	img1 = new ImageView(image);
    	System.out.println("adding img1");
    }
}


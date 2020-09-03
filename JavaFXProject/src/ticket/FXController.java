package ticket;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class FXController {

	@FXML private Text actiontarget;
	@FXML private Button kaufBtn;
    
	@FXML protected void handleKaufBtnAction(ActionEvent event) {
    	
        System.out.println("button clicked");
    }
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
    
}


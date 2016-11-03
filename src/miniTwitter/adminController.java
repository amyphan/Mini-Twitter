package miniTwitter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class adminController {
	@FXML // fx:id = "openUserView"
	private Button openUserView = new Button();
	
	@FXML
	private void handleOpenUserView(ActionEvent event){
		System.out.println("Button Clicked!");
	}
	
}

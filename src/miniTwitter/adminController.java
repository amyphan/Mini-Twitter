package miniTwitter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class adminController 
{
	
	//buttons
	@FXML // fx:id = "openUserView"
	private Button openUserView = new Button();
	@FXML // fx:id = "addUser"
	private Button addUser = new Button();
	@FXML // fx:id = "addGroup"
	private Button addGroup = new Button();
	@FXML // fx:id = "showUserView"
	private Button showUserView = new Button();
	@FXML // fx:id = "showUserTotal"
	private Button showUserTotal = new Button();
	@FXML // fx:id = "showGroupTotal"
	private Button showGroupTotal = new Button();
	@FXML // fx:id = "showMessageTotal"
	private Button showMessageTotal = new Button();
	@FXML // fx:id = "showPositivePercentage"
	private Button showPositivePercentage = new Button();
	
	//Text Fields
	@FXML // fx:id = "userIDText"
	private TextArea userIDText = new TextArea();
	@FXML // fx:id = "groupIDText"
	private TextArea groupIDText = new TextArea();
	
	
	@FXML
	private void handleOpenUserView(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MiniTwitterUser.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("User");
            stage.setScene(new Scene(root1));  
            stage.show();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }		
	}
	@FXML
	private void handleAddUser(ActionEvent event)
	{
		String username = userIDText.getText();
		System.out.println(username);
		
	}
	@FXML
	private void handleAddGroup(ActionEvent event)
	{
		String groupID = groupIDText.getText();
		System.out.println(groupID);
	}
	@FXML
	private void handleShowUserTotal(ActionEvent event)
	{
	}
	@FXML
	private void handleShowGroupTotal(ActionEvent event)
	{
	}
	@FXML
	private void handleShowMessageTotal(ActionEvent event)
	{
	}
	@FXML
	private void handleShowPositivePercentage(ActionEvent event)
	{
	}
	
}

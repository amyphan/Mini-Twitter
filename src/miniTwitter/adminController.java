package miniTwitter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
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
	
	//Initiate Twitter Services
	TwitterService service = TwitterService.getInstance();
	
	//Tree View
	@FXML
	private TreeView<String> treeView;
	TreeItem<String> root = new TreeItem<String>("Root");

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
		service.createUser(username);
		this.makeBranch(username, root);
		System.out.println(username);
		
	}
	@FXML
	private void handleAddGroup(ActionEvent event)
	{
		String groupID = groupIDText.getText();
		service.createGroup(groupID);
		this.makeBranch(groupID, root);
		System.out.println(groupID);
	}
	@FXML
	private void handleShowUserTotal(ActionEvent event)
	{
		
		Stage popupwindow=new Stage();
	      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("User Total");
		      
		      
		Label label1= new Label("User Total: " + service.totalUsers());
		      
		     
		Button button1= new Button("Close  window");
		     
		     
		button1.setOnAction(e -> popupwindow.close());
		     
		     

		VBox layout= new VBox(10);
		     
		      
		layout.getChildren().addAll(label1, button1);
		      
		layout.setAlignment(Pos.CENTER);
		      
		Scene scene1= new Scene(layout, 200, 150);
		      
		popupwindow.setScene(scene1);
		      
		popupwindow.showAndWait();
	}
	@FXML
	private void handleShowGroupTotal(ActionEvent event)
	{
		
		Stage popupwindow=new Stage();
	      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Group Total");
		      
		      
		Label label1= new Label("Group Total: " + service.totalGroups());
		      
		     
		Button button1= new Button("Close  window");
		     
		     
		button1.setOnAction(e -> popupwindow.close());
		     
		     

		VBox layout= new VBox(10);
		     
		      
		layout.getChildren().addAll(label1, button1);
		      
		layout.setAlignment(Pos.CENTER);
		      
		Scene scene1= new Scene(layout, 200, 150);
		      
		popupwindow.setScene(scene1);
		      
		popupwindow.showAndWait();
	}
	@FXML
	private void handleShowMessageTotal(ActionEvent event)
	{
		
		Stage popupwindow=new Stage();
	      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Message Total");
		      
		      
		Label label1= new Label("Message Total: " + service.totalMessages());
		      
		     
		Button button1= new Button("Close  window");
		     
		     
		button1.setOnAction(e -> popupwindow.close());
		     
		     

		VBox layout= new VBox(10);
		     
		      
		layout.getChildren().addAll(label1, button1);
		      
		layout.setAlignment(Pos.CENTER);
		      
		Scene scene1= new Scene(layout, 200, 150);
		      
		popupwindow.setScene(scene1);
		      
		popupwindow.showAndWait();
	}
	@FXML
	private void handleShowPositivePercentage(ActionEvent event)
	{
		Stage popupwindow=new Stage();
	      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Message Total");
		      
		      
		Label label1= new Label("Percentage of Postive Messages: " + service.postiveMessagePercentage() + "% ");
		      
		     
		Button button1= new Button("Close  window");
		     
		     
		button1.setOnAction(e -> popupwindow.close());
		     
		     

		VBox layout= new VBox(10);
		     
		      
		layout.getChildren().addAll(label1, button1);
		      
		layout.setAlignment(Pos.CENTER);
		      
		Scene scene1= new Scene(layout, 200, 150);
		      
		popupwindow.setScene(scene1);
		      
		popupwindow.showAndWait();
	}
	private TreeItem<String> makeBranch(String name, TreeItem<String> parent )
	{
		TreeItem<String> child = new TreeItem<>(name);
		child.setExpanded(true);
		parent.getChildren().add(child);
		return child;
	}
	
}

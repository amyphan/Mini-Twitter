package miniTwitter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class userController 
{
	TwitterService  start = TwitterService.getInstance();
	//buttons
	@FXML // fx:id = "followUs"
	private Button followUs = new Button();
	@FXML // fx:id = "postTweet"
	private Button postTweet = new Button();
	
	@FXML // fx:id = "userViewIDTextt"
	private TextArea userViewIDText = new TextArea();
	@FXML // fx:id = "tweetMessage"
	private TextArea tweetMessage = new TextArea();
	
	@FXML
	private void handlefollowUs(ActionEvent event)
	{
		String userViewID = userViewIDText.getText();
	}
	@FXML
	private void handleTweet(ActionEvent event)
	{
		String userViewID = userViewIDText.getText();
	}
	
	
	
}

package miniTwitter;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class TwitterService 
{
	private TreeItem<User> root = new TreeItem<User>();
	private TreeView<User> treeView = new TreeView<User>(root);
	public TwitterService()
	{
		
	}
	public User createUser(String name, String ID)
	{
		return new User(name, ID);
	}
	public UserGroup createGroup(String ID)
	{
		return new UserGroup(ID);
	}


}

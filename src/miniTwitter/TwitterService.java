package miniTwitter;

import java.util.ArrayList;
import java.util.UUID;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class TwitterService 
{
	private TreeItem<User> root = new TreeItem<User>();
	private TreeView<User> treeView = new TreeView<User>(root);
	private ArrayList<User> usersList = new ArrayList<User>();
	private ArrayList<UserGroup> userGroupList = new ArrayList<UserGroup>();
	public TwitterService()
	{
		
	}
	public void createUser(String name)
	{
		User user = new User(name, this.generateID());
		usersList.add(user);
		TreeItem<User> userTree = new TreeItem<User>(user);
		root.getChildren().add(userTree);
	}
	public void createGroup(String name)
	{
		UserGroup userGroup = new UserGroup(name, this.generateID());
		userGroupList.add(userGroup);
	}
	public void followUser(User user, User isfollowing)
	{
		user.followingUser(isfollowing);
	}
	public int totalUsers()
	{
		return this.usersList.size();
	}
	public int totalGroups()
	{
		return this.userGroupList.size();
	}
	public int totalMessages()
	{
		int total = 0;
		for(int ndx = 0; ndx < usersList.size(); ndx ++)
		{
			total += usersList.get(ndx).userMessageTotal();
		}
		return total;
	}
	public double postiveMessagePercentage()
	{
		int positiveTotal = 0;
		for(int ndx = 0; ndx < usersList.size(); ndx ++)
		{
			positiveTotal += usersList.get(ndx).postiveMessageTotal();
		}
		return (float)(((double)positiveTotal * 100) / (double)this.totalMessages());
	}
	private String generateID()
	{
		return UUID.randomUUID().toString();
	}


}

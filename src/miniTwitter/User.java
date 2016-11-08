package miniTwitter;

import java.util.ArrayList;

public class User extends UserGroup
{
	private String userId;
	private String userName;
	private ArrayList<User> followers = new ArrayList<User>();
	private ArrayList<User> following = new ArrayList<User>();
	private NewsFeed userNewsFeed;
	
	public User(String name, String id)
	{
		this.userName = name;
		this.userId = id;
		this.userNewsFeed = new NewsFeed();
	}
	public void followingUser(User username)
	{
		following.add(username);
	}
	public void addMessage(TwitterMessage message)
	{
		this.userNewsFeed.addMessage(message);
	}
	public ArrayList<User> getFollowers()
	{
		return this.followers;
	}
	public String getUserID()
	{
		return this.userId;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public void setUserID(String id)
	{
		this.userId = id;
	}
	public void setUsername(String name)
	{
		this.userName = name;
	}
	public int userMessageTotal()
	{
		return this.userNewsFeed.getNewsFeedSize();
	}
	public int postiveMessageTotal()
	{
		return this.userNewsFeed.numOfPositives();
	}
	public String toString()
	{
		return "Username: " + this.getUserName() + "\nID: " + this.getUserID(); 
	}
	
}

package miniTwitter;

import java.util.ArrayList;

public class UserGroup 
{
	private String groupID;
	private ArrayList<User> userList = new ArrayList<User>();
	
	public UserGroup(String id, ArrayList<User> listOfUsers)
	{
		this.groupID = id;
		this.userList = listOfUsers;
	}
	public UserGroup(String id)
	{
		this.groupID = id;
	}
	public UserGroup()
	{
		
	}
	public void addUser(User user)
	{
		this.userList.add(user);
	}
	public String getGroupID()
	{
		return this.groupID;
	}
	public int getNumberOfUsers()
	{
		return this.userList.size();
	}

}

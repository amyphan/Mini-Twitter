package miniTwitter;

import java.util.ArrayList;

public class UserGroup 
{
	private String groupID;
	private String groupName;
	private ArrayList<User> userList = new ArrayList<User>();
	
	public UserGroup(String name, String id, ArrayList<User> listOfUsers)
	{
		this.groupName = name;
		this.groupID = id;
		this.userList = listOfUsers;
	}
	public UserGroup(String name, String id)
	{
		this.groupName = name;
		this.groupID = id;
	}
	public UserGroup()
	{
		
	}
	public void addUser(User user)
	{
		this.userList.add(user);
	}
	public String getGroupName()
	{
		return this.groupName;
	}
	public String getGroupID()
	{
		return this.groupID;
	}
	public int getNumberOfUsers()
	{
		return this.userList.size();
	}
	public String toString()
	{
		return "Group Name: " + this.getGroupName() + "\nGroup ID: " + this.getGroupID();
	}

}

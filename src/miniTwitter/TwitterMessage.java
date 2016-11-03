package miniTwitter;

public class TwitterMessage 
{
	private String message;
	
	public TwitterMessage(String userMessage)
	{
		this.message = userMessage;
	}
	public TwitterMessage()
	{
		
	}
	public String getMessage()
	{
		return this.message;
	}
}

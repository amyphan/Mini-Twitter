package miniTwitter;

import java.util.ArrayList;

public class NewsFeed extends TwitterMessage
{
	private ArrayList<TwitterMessage> feed;
	private String[] positiveWords = { "Good", "Great", "Excellent", "Love", };
	
	public NewsFeed (TwitterMessage message)
	{
		feed.add(message);
	}
	public NewsFeed (ArrayList<TwitterMessage> message)
	{
		feed.addAll(message);
	}
	public NewsFeed()
	{
		
	}
	public void addMessage(TwitterMessage message)
	{
		feed.add(message);
	}
	public int getNewsFeedSize()
	{
		return this.feed.size();
	}
	public int numOfPositives()
	{
		int count = 0;
		for (int i = 0; i < feed.size(); i ++)
		{
			for(int j = 0; j < positiveWords.length; j ++)
			{
				if ( feed.get(i).getMessage().toLowerCase().contains(positiveWords[j].toLowerCase()))
				{
					count ++;
				}
			}
		}
		return count;
	}
	public float percentagePositive()
	{
		double numPositives = (double) this.numOfPositives();
		double totalMessages = (double) this.getNewsFeedSize();
		
		return (float)((numPositives * 100) / totalMessages);
	}
}

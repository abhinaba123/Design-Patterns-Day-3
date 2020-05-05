package com.cognizant.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator 
{
	private List<IUser> users;

	public ChatMediator() 
	{
		super();
		users = new ArrayList<>();;
	}

	@Override
	public void addUser(IUser user) 
	{
		// TODO Auto-generated method stub
		users.add(user);
		
	}

	@Override
	public void sendMessage(String msg,IUser user) {
		// TODO Auto-generated method stub
		for(IUser u:users)
		{
			if(u!=user)
			{
				u.receiveMessage(msg);
			}
		}
	}

}

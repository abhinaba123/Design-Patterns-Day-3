package com.cognizant.mediator;

public interface IChatMediator 
{
	void addUser(IUser user);
	void sendMessage(String msg,IUser user);
}

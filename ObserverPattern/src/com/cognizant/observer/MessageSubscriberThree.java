package com.cognizant.observer;

public class MessageSubscriberThree implements Observer {

	@Override
	public void update(Message m) 
	{
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

}

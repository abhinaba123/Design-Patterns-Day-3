package com.cognizant.mediator;

public class BasicUser implements IUser 
{
	private IChatMediator chatMediator;
	private String name;
	
	
	public BasicUser(IChatMediator chatMediator, String name) 
	{
		super();
		this.chatMediator = chatMediator;
		this.name = name;
		chatMediator.addUser(this);
	}

	@Override
	public void receiveMessage(String msg) 
	{
		// TODO Auto-generated method stub
		System.out.println("User:" +this+"   "+"Message:" +msg);
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(msg,this);
	}

	@Override
	public String toString() {
		return "BasicUser [name=" + name + "]";
	}

}

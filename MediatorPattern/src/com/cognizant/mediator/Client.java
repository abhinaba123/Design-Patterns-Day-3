package com.cognizant.mediator;

public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IChatMediator chatMediator=new ChatMediator();
		
		IUser u1=new BasicUser(chatMediator, "A");
		IUser u2=new BasicUser(chatMediator, "B");
		IUser u3=new PremiumUser(chatMediator, "C");
		IUser u4=new PremiumUser(chatMediator, "D");
		
		System.out.println("******A******");
		u1.sendMessage("This is A");
		System.out.println("******B******");
		u2.sendMessage("This is B");
		System.out.println("******C******");
		u3.sendMessage("This is C");
		System.out.println("******D******");
		u4.sendMessage("This is D");

	}

}

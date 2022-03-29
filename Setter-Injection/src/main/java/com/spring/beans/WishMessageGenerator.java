package com.spring.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	Date date;

	public WishMessageGenerator() {
	System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	// Setter Injection
	public void  setDate(Date date)
	{
		this.date= date;
	}
	
	// B. Method
	public String wishMsg(String name)
	{
		System.out.println("WishMessageGenerator.wishMsg()");
		int hours = date.getHours();
		String msg=null;
		if(hours<12)
			 msg="Good Morning  :"+name;
		else if(hours<16)
			msg="Good Afternoon  :"+name;
		else if(hours<20)
			msg="Good Evenning :  "+name;
		else
			msg="Good Night : "+name;
		
		return msg;
	}
	
	

}

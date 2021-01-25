package com.lti.car;
import org.springframework.stereotype.Component;

@Component("mw")
public class MacWheel {

	public void roll()
	{
		System.out.println("MacWheel is rolling...");
	}
	
}

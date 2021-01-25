package com.lti.car;

import org.springframework.stereotype.Component;

@Component("w")
public class Wheel {

	public void roll()
	{
		System.out.println("Wheel is rolling...");
	}
	
}

package com.lti.car;

import org.springframework.stereotype.Component;

@Component("aw")
public class AlloyedWheel extends Wheel {
	
	public void roll()
	{
		System.out.println("Alloyed Wheel is rolling...");
	}

}
 
package com.lti.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drive {

	@Autowired
	@Qualifier("w")
	Wheel w;
	
	public void run()
	{
		w.roll();
	}
	
}

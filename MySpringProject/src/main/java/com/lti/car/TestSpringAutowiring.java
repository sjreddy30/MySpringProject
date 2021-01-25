package com.lti.car;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-autowire.xml")
public class TestSpringAutowiring {
	
@Autowired
Drive d;

@Test
public void test1()
{
	d.run();
	}

}

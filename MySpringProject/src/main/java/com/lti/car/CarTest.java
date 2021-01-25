package com.lti.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CarTest {
	public static void main(String[] args) {
		/*
        Piston pist1 = new Piston(10);
        Engine eng1 = new Engine(pist1);
        Car car1 = new Car(eng1);
        car1.run();

        Piston pist2 = new Piston(12);
        Engine eng2 = new Engine(pist2);
        Car car2 = new Car(eng2);
        car2.run();

        Piston pist3 = new Piston(14);
        Engine eng3 = new Engine(pist3);
        Car car3 = new Car(eng3);
        car3.run(); */

		System.out.println("-------NOW THE SPRING WAY------------------");

		System.out.println("Loading the container....");
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("myspring.xml");
		System.out.println("Loaded the container...."+container);

		Car c1 = (Car)container.getBean("mycar");
		System.out.println("c1 : "+c1.hashCode());
		c1.run();

		Car c2 = (Car)container.getBean("mycar1");
		System.out.println("c2 : "+c2.hashCode());
		c2.run();
		

//		Car c3 = (Car)container.getBean("mycar1");
//		System.out.println("c3 : "+c3.hashCode());
//		c3.run();
	}
}

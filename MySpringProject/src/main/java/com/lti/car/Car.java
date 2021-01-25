package com.lti.car;

public class Car {
    Engine engine;
    String model;
    
    public Car()
    {
    	System.out.println("Car()...Explict No-Arg Ctor");
    }
    
    public Car(Engine e) {
        System.out.println("Car(Engine e) ctor....");
        engine = e;
    }
    
    
//    public Car(Engine e,String m) {
//        System.out.println("Car(Engine e) ctor....");
//        model = m;
//        engine = e;
//    }        
   
    public void setCar(Engine e)
    {
    	System.out.println("setCar(Engine e) ctor");
    	engine=e;
    }
    public void setModel(String m)
    {
    	System.out.println("setModel(myModel) ctor");
    	model=m;
    }
    public void run() {
        System.out.println(model+" car is running ! ");
        
    }
}
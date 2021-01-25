package com.lti.car;

public class Engine {
private Piston piston; //just a reference
    
    public Engine(Piston pist) {
        System.out.println("Engine(Piston p) ctor...");
        piston = pist;
    }

}

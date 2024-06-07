package com.ritik.demorest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Alien getAlien() {
        System.out.println("I got called!!");
        Alien a1 = new Alien();
        a1.setName("Navin");
        a1.setPoints(75);
        
        Alien a2 = new Alien();
        a2.setName("Abhishek");
        a2.setPoints(69);
        
//        List<Alien> = Arrays
        return a1;
    }
}

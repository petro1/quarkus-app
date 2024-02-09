package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/helloAgain")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloAgain() {
        System.out.println("test");
        return "Hello from RESTEasy Reactive";
    }
}

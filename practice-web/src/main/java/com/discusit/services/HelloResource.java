package com.discusit.services;

import com.discusit.beans.HelloBean;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Darshan Patel
 */
@Path("hello")
public class HelloResource {

    @EJB
    private HelloBean helloBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getData() {
        return "Hello People";
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataName(@PathParam("name") String name) {
        System.out.println("getDataName is called");
        return helloBean.getData(name);
    }
}

package com.discusit.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Darshan Patel
 */
@Path("exception")
@Produces(MediaType.APPLICATION_JSON)
public class ExceptionResource {

    @GET
    public Response getException() {
        if (true) {
            throw new NullPointerException("dummy excpetion");
        }
        return Response.ok("This is testing in new resource").build();
    }

}

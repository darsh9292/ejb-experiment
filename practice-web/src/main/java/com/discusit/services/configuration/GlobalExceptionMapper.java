package com.discusit.services.configuration;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Darshan Patel
 */
@Provider
public class GlobalExceptionMapper implements ExceptionMapper<WebApplicationException> {

    @Override
    public Response toResponse(WebApplicationException ex) {
        //"{\"message\": \"Internal server error\"}"
        System.out.println("handled by global exception mapper");
        Response res = ex.getResponse();
        return Response.status(res.getStatus()).entity("Error occured").build();
    }

}

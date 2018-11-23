package com.discusit.services;

import com.discusit.beans.CountryBean;
import com.discusit.proxy.CountryProxy;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Darshan Patel
 */
@Path("country")
public class CountryResource {

    @EJB
    private CountryBean countryBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCountryData() {
        List<CountryProxy> countryList = countryBean.getCountryList();
        return Response.ok(countryList).build();
    }

    @Path("{id:[0-9]+}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCountry(@PathParam("id") Integer id) {
        return Response.ok("{\"status\":\"success-" + id + "\"}").build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCountryData(CountryProxy countryProxy) {
        System.out.println("list : " + countryProxy.getList());
        boolean saveCountry = countryBean.saveCountry(countryProxy);
        if (saveCountry) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

}

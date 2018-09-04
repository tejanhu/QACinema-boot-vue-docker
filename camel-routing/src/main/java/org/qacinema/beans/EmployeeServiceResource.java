package org.qacinema.beans;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class EmployeeServiceResource {

    @Context
    private UriInfo uriInfo;

	public EmployeeServiceResource() { }

	@POST
	@Path("/boo")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getCustomer(String body) {
		return null;
	}
}

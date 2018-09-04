package org.qacinema.beans;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class EMailServiceResource {

    @Context
    private UriInfo uriInfo;

	public EMailServiceResource() { }

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getCustomer(String body) {
		return null;
	}
}

package org.virtuSkill.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class SimpleService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String callMe() {
		return "Created first No Xml Configuration Rest Service";
	}
}

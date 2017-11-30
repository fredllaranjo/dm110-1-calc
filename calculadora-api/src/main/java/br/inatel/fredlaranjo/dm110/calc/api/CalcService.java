package br.inatel.fredlaranjo.dm110.calc.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface that exposes calculator methods
 * @author fredlaranjo
 *
 */
public interface CalcService {

	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Response sum(@QueryParam("first") int first, @QueryParam("second") int second);

	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Response subtract(@FormParam("first") int first, @FormParam("second") int second);

}

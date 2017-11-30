package br.inatel.fredlaranjo.dm110.calc.core.impl;

import javax.ws.rs.core.Response;

import br.inatel.fredlaranjo.dm110.calc.api.CalcService;
import br.inatel.fredlaranjo.dm110.calc.core.business.CalcBusiness;

/**
 * Implementation of {@link CalcService}.
 * @author fredlaranjo
 *
 */
public class CalcServiceImpl implements CalcService{

	private final CalcBusiness business = new CalcBusiness();

	@Override
	public Response sum(int first, int second) {
		return Response.ok().entity(business.sum(first, second)).build();
	}

	@Override
	public Response subtract(int first, int second) {
		return Response.ok().entity(business.subtract(first, second)).build();
	}

}

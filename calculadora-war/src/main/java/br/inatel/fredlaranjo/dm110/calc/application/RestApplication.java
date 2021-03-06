package br.inatel.fredlaranjo.dm110.calc.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.fredlaranjo.dm110.calc.core.impl.CalcServiceImpl;

@ApplicationPath("/rest")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalcServiceImpl.class);
		return classes;
	}

}

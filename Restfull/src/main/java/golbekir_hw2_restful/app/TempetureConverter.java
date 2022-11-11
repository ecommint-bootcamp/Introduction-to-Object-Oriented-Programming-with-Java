package golbekir_hw2_restful.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import golbekir_hw2_restful.resources.TempetureConverterResource;

@ApplicationPath("/resources")
public class TempetureConverter extends Application {

	Set<Object> singletons = new HashSet<>();

	/**
	 * To make service object a singleton.
	 */
	public Set<Object> getSingletons() {
//		System.out.println("In getSingletons()");
		singletons.add(new TempetureConverterResource());
		return singletons;
	}
}

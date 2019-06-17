package io.apicurio.oai2;

import io.apicurio.oai2.beans.Baz;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/widgets")
public interface WidgetsResource {
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  List<Baz> generatedMethod1(Baz body);

  @DELETE
  @Produces("application/json")
  @Consumes({"application/json", "multipart/form-data"})
  void generatedMethod2();
}

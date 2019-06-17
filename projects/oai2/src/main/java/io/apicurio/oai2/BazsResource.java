package io.apicurio.oai2;

import io.apicurio.oai2.beans.Baz;
import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/bazs")
public interface BazsResource {
  /**
   * Gets a list of all `Baz` entities.
   */
  @GET
  @Produces("application/json")
  @Consumes({"application/json", "multipart/form-data"})
  List<Baz> getBazs();

  /**
   * Creates a new instance of a `Baz`.
   */
  @POST
  @Produces("application/json")
  @Consumes({"application/json", "multipart/form-data"})
  void createBaz(Baz body);

  /**
   * Gets the details of a single instance of a `Baz`.
   */
  @Path("/{bazId}")
  @GET
  @Produces("application/json")
  @Consumes({"application/json", "multipart/form-data"})
  Baz getBaz(@PathParam("bazId") String bazId);

  /**
   * Updates an existing `Baz`.
   */
  @Path("/{bazId}")
  @PUT
  @Produces("application/json")
  @Consumes({"application/json", "multipart/form-data"})
  void updateBaz(@PathParam("bazId") String bazId, Baz body);

  /**
   * Deletes an existing `Baz`.
   */
  @Path("/{bazId}")
  @DELETE
  @Produces("application/json")
  @Consumes({"application/json", "multipart/form-data"})
  void deleteBaz(@PathParam("bazId") String bazId);
}

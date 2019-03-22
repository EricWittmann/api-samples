package c;

import c.beans.Dinner;
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
@Path("/dinners")
public interface DinnersResource {
  /**
   * Gets a list of all `Dinner` entities.
   */
  @GET
  @Produces("application/json")
  List<Dinner> getDinners();

  /**
   * Creates a new instance of a `Dinner`.
   */
  @POST
  @Consumes("application/json")
  void createDinner(Dinner data);

  /**
   * Gets the details of a single instance of a `Dinner`.
   */
  @Path("/{dinnerId}")
  @GET
  @Produces("application/json")
  Dinner getDinner(@PathParam("dinnerId") String dinnerId);

  /**
   * Updates an existing `Dinner`.
   */
  @Path("/{dinnerId}")
  @PUT
  @Consumes("application/json")
  void updateDinner(@PathParam("dinnerId") String dinnerId, Dinner data);

  /**
   * Deletes an existing `Dinner`.
   */
  @Path("/{dinnerId}")
  @DELETE
  void deleteDinner(@PathParam("dinnerId") String dinnerId);
}

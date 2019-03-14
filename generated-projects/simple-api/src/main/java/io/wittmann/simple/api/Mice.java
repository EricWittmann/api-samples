package io.wittmann.simple.api;

import io.wittmann.simple.api.beans.Mouse;
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
@Path("/mice")
public interface Mice {
  /**
   * Gets a list of all `Mouse` entities.
   */
  @GET
  @Produces("application/json")
  List<Mouse> getMice();

  /**
   * Creates a new instance of a `Mouse`.
   */
  @POST
  @Consumes("application/json")
  void createMouse(Mouse data);

  /**
   * Gets the details of a single instance of a `Mouse`.
   */
  @Path("/{mouseId}")
  @GET
  @Produces("application/json")
  Mouse getMouse(@PathParam("mouseId") String mouseId);

  /**
   * Updates an existing `Mouse`.
   */
  @Path("/{mouseId}")
  @PUT
  @Consumes("application/json")
  void updateMouse(@PathParam("mouseId") String mouseId, Mouse data);

  /**
   * Deletes an existing `Mouse`.
   */
  @Path("/{mouseId}")
  @DELETE
  void deleteMouse(@PathParam("mouseId") String mouseId);
}

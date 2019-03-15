package org.example.api;

import java.lang.String;
import java.util.List;
import java.util.concurrent.CompletionStage;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.example.api.beans.Mouse;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/mice")
public interface MiceResource {
  /**
   * Gets a list of all `Mouse` entities.
   */
  @GET
  @Produces("application/json")
  CompletionStage<List<Mouse>> getMice();

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
  CompletionStage<Mouse> getMouse(@PathParam("mouseId") String mouseId);

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

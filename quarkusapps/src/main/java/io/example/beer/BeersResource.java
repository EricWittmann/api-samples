package io.example.beer;

import io.example.beer.beans.Beer;
import java.lang.String;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/beers")
public interface BeersResource {
  /**
   * Gets a list of all `Beer` entities.
   */
  @GET
  List<Beer> getbeers();

  /**
   * Creates a new instance of a `Beer`.
   */
  @POST
  void createBeer(Beer body);

  /**
   * Gets the details of a single instance of a `Beer`.
   */
  @Path("/{beerId}")
  @GET
  Beer getBeer(@PathParam("beerId") String beerId);

  /**
   * Updates an existing `Beer`.
   */
  @Path("/{beerId}")
  @PUT
  void updateBeer(@PathParam("beerId") String beerId, Beer body);

  /**
   * Deletes an existing `Beer`.
   */
  @Path("/{beerId}")
  @DELETE
  void deleteBeer(@PathParam("beerId") String beerId);
}

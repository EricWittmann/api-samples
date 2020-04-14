package org.example.demo.library;

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
import org.example.demo.library.beans.Author;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/authors")
public interface AuthorsResource {
  /**
   * Gets a list of all `Author` entities.
   */
  @GET
  @Produces("application/json")
  List<Author> getauthors();

  /**
   * Creates a new instance of a `Author`.
   */
  @POST
  @Consumes("application/json")
  void createAuthor(Author data);

  /**
   * Gets the details of a single instance of a `Author`.
   */
  @Path("/{authorId}")
  @GET
  @Produces("application/json")
  Author getAuthor(@PathParam("authorId") String authorId);

  /**
   * Updates an existing `Author`.
   */
  @Path("/{authorId}")
  @PUT
  @Consumes("application/json")
  void updateAuthor(@PathParam("authorId") String authorId, Author data);

  /**
   * Deletes an existing `Author`.
   */
  @Path("/{authorId}")
  @DELETE
  void deleteAuthor(@PathParam("authorId") String authorId);
}

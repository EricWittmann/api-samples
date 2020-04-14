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
import org.example.demo.library.beans.Book;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/books")
public interface BooksResource {
  /**
   * Gets a list of all `Book` entities.
   */
  @GET
  @Produces("application/json")
  List<Book> getbooks();

  /**
   * Creates a new instance of a `Book`.
   */
  @POST
  @Consumes("application/json")
  void createBook(Book data);

  /**
   * Gets the details of a single instance of a `Book`.
   */
  @Path("/{bookId}")
  @GET
  @Produces("application/json")
  Book getBook(@PathParam("bookId") String bookId);

  /**
   * Updates an existing `Book`.
   */
  @Path("/{bookId}")
  @PUT
  @Consumes("application/json")
  void updateBook(@PathParam("bookId") String bookId, Book data);

  /**
   * Deletes an existing `Book`.
   */
  @Path("/{bookId}")
  @DELETE
  void deleteBook(@PathParam("bookId") String bookId);
}


package org.example.demo.library.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Book
 * <p>
 * Information about a book.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ddsn",
    "title",
    "author",
    "publish-date"
})
public class Book {

    @JsonProperty("ddsn")
    private String ddsn;
    @JsonProperty("title")
    private String title;
    /**
     * Root Type for Author
     * <p>
     * The author of a book.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("The author of a book.")
    private Author author;
    @JsonProperty("publish-date")
    private String publishDate;

    @JsonProperty("ddsn")
    public String getDdsn() {
        return ddsn;
    }

    @JsonProperty("ddsn")
    public void setDdsn(String ddsn) {
        this.ddsn = ddsn;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Root Type for Author
     * <p>
     * The author of a book.
     * 
     */
    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    /**
     * Root Type for Author
     * <p>
     * The author of a book.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("publish-date")
    public String getPublishDate() {
        return publishDate;
    }

    @JsonProperty("publish-date")
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

}


package io.apicurio.demo.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Widget
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "one",
    "three"
})
public class Widget {

    @JsonProperty("one")
    private String one;
    @JsonProperty("three")
    private Integer three;

    @JsonProperty("one")
    public String getOne() {
        return one;
    }

    @JsonProperty("one")
    public void setOne(String one) {
        this.one = one;
    }

    @JsonProperty("three")
    public Integer getThree() {
        return three;
    }

    @JsonProperty("three")
    public void setThree(Integer three) {
        this.three = three;
    }

}

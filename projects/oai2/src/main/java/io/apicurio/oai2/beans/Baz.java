
package io.apicurio.oai2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Baz
 * <p>
 * Hello baz.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "z1",
    "x1",
    "v3"
})
public class Baz {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("z1")
    private Integer z1;
    @JsonProperty("x1")
    private Boolean x1;
    /**
     * asdf asdf asf 
     * 
     */
    @JsonProperty("v3")
    @JsonPropertyDescription("asdf asdf asf ")
    private String v3;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("z1")
    public Integer getZ1() {
        return z1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("z1")
    public void setZ1(Integer z1) {
        this.z1 = z1;
    }

    @JsonProperty("x1")
    public Boolean getX1() {
        return x1;
    }

    @JsonProperty("x1")
    public void setX1(Boolean x1) {
        this.x1 = x1;
    }

    /**
     * asdf asdf asf 
     * 
     */
    @JsonProperty("v3")
    public String getV3() {
        return v3;
    }

    /**
     * asdf asdf asf 
     * 
     */
    @JsonProperty("v3")
    public void setV3(String v3) {
        this.v3 = v3;
    }

}

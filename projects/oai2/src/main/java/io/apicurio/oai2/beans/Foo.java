
package io.apicurio.oai2.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Hello foo.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "p2"
})
public class Foo {

    /**
     * Hello p2
     * 
     */
    @JsonProperty("p2")
    @JsonPropertyDescription("Hello p2")
    private Foo.P2 p2;

    /**
     * Hello p2
     * 
     */
    @JsonProperty("p2")
    public Foo.P2 getP2() {
        return p2;
    }

    /**
     * Hello p2
     * 
     */
    @JsonProperty("p2")
    public void setP2(Foo.P2 p2) {
        this.p2 = p2;
    }

    public enum P2 {

        V_1("v1"),
        V_3("v3");
        private final String value;
        private final static Map<String, Foo.P2> CONSTANTS = new HashMap<String, Foo.P2>();

        static {
            for (Foo.P2 c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private P2(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Foo.P2 fromValue(String value) {
            Foo.P2 constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

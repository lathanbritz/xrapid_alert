package space.xrapid.domain.kraken;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "XXRPZJPY",
    "last"
})
public class Result {

  @JsonProperty("last")
  private String last;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<>();


  @JsonProperty("last")
  public String getLast() {
    return last;
  }

  @JsonProperty("last")
  public void setLast(String last) {
    this.last = last;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}
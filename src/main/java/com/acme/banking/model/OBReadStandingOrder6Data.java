package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBStandingOrder6;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadStandingOrder6Data
 */

@JsonTypeName("OBReadStandingOrder6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadStandingOrder6Data {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OBStandingOrder6> standingOrder = new ArrayList<>();

  public OBReadStandingOrder6Data standingOrder(List<OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder6Data addStandingOrderItem(OBStandingOrder6 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Get standingOrder
   * @return standingOrder
   */
  
  @Schema(name = "StandingOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrder")
  public List<OBStandingOrder6> getStandingOrder() {
    return standingOrder;
  }

  @JsonProperty("StandingOrder")
  public void setStandingOrder(List<OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder6Data obReadStandingOrder6Data = (OBReadStandingOrder6Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder6Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder6Data {\n");
    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


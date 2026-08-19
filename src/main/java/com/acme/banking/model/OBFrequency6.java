package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBFrequency6Type;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Regularity with which credit transfer instructions are to be created and processed
 */

@Schema(name = "OBFrequency6", description = "Regularity with which credit transfer instructions are to be created and processed")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBFrequency6 {

  private OBFrequency6Type type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer countPerPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String pointInTime;

  public OBFrequency6() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBFrequency6(OBFrequency6Type type) {
    this.type = type;
  }

  public OBFrequency6 type(OBFrequency6Type type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public OBFrequency6Type getType() {
    return type;
  }

  @JsonProperty("Type")
  public void setType(OBFrequency6Type type) {
    this.type = type;
  }

  public OBFrequency6 countPerPeriod(@Nullable Integer countPerPeriod) {
    this.countPerPeriod = countPerPeriod;
    return this;
  }

  /**
   * Number of instructions to be created and processed during the specified period. Specifies a frequency in terms of a count per period within a specified frequency type. Note: should not be used alongside `PointInTime`
   * @return countPerPeriod
   */
  
  @Schema(name = "CountPerPeriod", example = "1", description = "Number of instructions to be created and processed during the specified period. Specifies a frequency in terms of a count per period within a specified frequency type. Note: should not be used alongside `PointInTime`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CountPerPeriod")
  public @Nullable Integer getCountPerPeriod() {
    return countPerPeriod;
  }

  @JsonProperty("CountPerPeriod")
  public void setCountPerPeriod(@Nullable Integer countPerPeriod) {
    this.countPerPeriod = countPerPeriod;
  }

  public OBFrequency6 pointInTime(@Nullable String pointInTime) {
    this.pointInTime = pointInTime;
    return this;
  }

  /**
   * Exact2NumericText - Further information on the exact point in time the event should take place. Specifies a frequency in terms of an exact point in time or moment within a specified frequency type. Note: should not be used alongside `CountPerPeriod`.
   * @return pointInTime
   */
  
  @Schema(name = "PointInTime", example = "00", description = "Exact2NumericText - Further information on the exact point in time the event should take place. Specifies a frequency in terms of an exact point in time or moment within a specified frequency type. Note: should not be used alongside `CountPerPeriod`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PointInTime")
  public @Nullable String getPointInTime() {
    return pointInTime;
  }

  @JsonProperty("PointInTime")
  public void setPointInTime(@Nullable String pointInTime) {
    this.pointInTime = pointInTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFrequency6 obFrequency6 = (OBFrequency6) o;
    return Objects.equals(this.type, obFrequency6.type) &&
        Objects.equals(this.countPerPeriod, obFrequency6.countPerPeriod) &&
        Objects.equals(this.pointInTime, obFrequency6.pointInTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, countPerPeriod, pointInTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFrequency6 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countPerPeriod: ").append(toIndentedString(countPerPeriod)).append("\n");
    sb.append("    pointInTime: ").append(toIndentedString(pointInTime)).append("\n");
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


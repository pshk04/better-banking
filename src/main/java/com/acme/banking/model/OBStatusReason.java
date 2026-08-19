package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
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
 * OBStatusReason
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBStatusReason {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String statusReasonCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String statusReasonDescription;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String path;

  public OBStatusReason statusReasonCode(@Nullable String statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
    return this;
  }

  /**
   * Specifies the status reason in a code form.   For a full description see `OBExternalStatusReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return statusReasonCode
   */
  
  @Schema(name = "StatusReasonCode", example = "U004", description = "Specifies the status reason in a code form.   For a full description see `OBExternalStatusReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusReasonCode")
  public @Nullable String getStatusReasonCode() {
    return statusReasonCode;
  }

  @JsonProperty("StatusReasonCode")
  public void setStatusReasonCode(@Nullable String statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
  }

  public OBStatusReason statusReasonDescription(@Nullable String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
    return this;
  }

  /**
   * Description supporting the StatusReasonCode.
   * @return statusReasonDescription
   */
  
  @Schema(name = "StatusReasonDescription", example = "Permissions field is missing", description = "Description supporting the StatusReasonCode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusReasonDescription")
  public @Nullable String getStatusReasonDescription() {
    return statusReasonDescription;
  }

  @JsonProperty("StatusReasonDescription")
  public void setStatusReasonDescription(@Nullable String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
  }

  public OBStatusReason path(@Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * Recommended but optional reference to JSON path if relevant to the StatusReasonCode.
   * @return path
   */
  
  @Schema(name = "Path", example = "Data.Permissions", description = "Recommended but optional reference to JSON path if relevant to the StatusReasonCode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public @Nullable String getPath() {
    return path;
  }

  @JsonProperty("Path")
  public void setPath(@Nullable String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatusReason obStatusReason = (OBStatusReason) o;
    return Objects.equals(this.statusReasonCode, obStatusReason.statusReasonCode) &&
        Objects.equals(this.statusReasonDescription, obStatusReason.statusReasonDescription) &&
        Objects.equals(this.path, obStatusReason.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusReasonCode, statusReasonDescription, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatusReason {\n");
    sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
    sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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


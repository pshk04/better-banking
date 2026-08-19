package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBError1;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 */

@Schema(name = "OBErrorResponse1", description = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBErrorResponse1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  private List<OBError1> errors = new ArrayList<>();

  public OBErrorResponse1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBErrorResponse1(List<OBError1> errors) {
    this.errors = errors;
  }

  public OBErrorResponse1 id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
   * @return id
   */
  
  @Schema(name = "Id", description = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("Id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public OBErrorResponse1 code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Deprecated <br />High level textual error code, to help categorise the errors.
   * @return code
   */
  
  @Schema(name = "Code", example = "400 BadRequest", description = "Deprecated <br />High level textual error code, to help categorise the errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public @Nullable String getCode() {
    return code;
  }

  @JsonProperty("Code")
  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public OBErrorResponse1 message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Deprecated <br />Brief Error message
   * @return message
   */
  
  @Schema(name = "Message", example = "There is something wrong with the request parameters provided", description = "Deprecated <br />Brief Error message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("Message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public OBErrorResponse1 errors(List<OBError1> errors) {
    this.errors = errors;
    return this;
  }

  public OBErrorResponse1 addErrorsItem(OBError1 errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @NotNull
  @Schema(name = "Errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Errors")
  public List<OBError1> getErrors() {
    return errors;
  }

  @JsonProperty("Errors")
  public void setErrors(List<OBError1> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBErrorResponse1 obErrorResponse1 = (OBErrorResponse1) o;
    return Objects.equals(this.id, obErrorResponse1.id) &&
        Objects.equals(this.code, obErrorResponse1.code) &&
        Objects.equals(this.message, obErrorResponse1.message) &&
        Objects.equals(this.errors, obErrorResponse1.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBErrorResponse1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


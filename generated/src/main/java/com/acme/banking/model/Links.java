package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Links relevant to the payload
 */

@Schema(name = "Links", description = "Links relevant to the payload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class Links {

  private URI self;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI first;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI prev;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI next;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI last;

  public Links() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Links(URI self) {
    this.self = self;
  }

  public Links self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
   */
  @NotNull
  @Schema(name = "Self", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Self")
  public URI getSelf() {
    return self;
  }

  @JsonProperty("Self")
  public void setSelf(URI self) {
    this.self = self;
  }

  public Links first(@Nullable URI first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
   */
  
  @Schema(name = "First", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("First")
  public @Nullable URI getFirst() {
    return first;
  }

  @JsonProperty("First")
  public void setFirst(@Nullable URI first) {
    this.first = first;
  }

  public Links prev(@Nullable URI prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
   */
  
  @Schema(name = "Prev", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Prev")
  public @Nullable URI getPrev() {
    return prev;
  }

  @JsonProperty("Prev")
  public void setPrev(@Nullable URI prev) {
    this.prev = prev;
  }

  public Links next(@Nullable URI next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  
  @Schema(name = "Next", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Next")
  public @Nullable URI getNext() {
    return next;
  }

  @JsonProperty("Next")
  public void setNext(@Nullable URI next) {
    this.next = next;
  }

  public Links last(@Nullable URI last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   */
  
  @Schema(name = "Last", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Last")
  public @Nullable URI getLast() {
    return last;
  }

  @JsonProperty("Last")
  public void setLast(@Nullable URI last) {
    this.last = last;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.self, links.self) &&
        Objects.equals(this.first, links.first) &&
        Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.last, links.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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


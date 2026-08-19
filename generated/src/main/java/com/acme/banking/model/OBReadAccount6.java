package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.Links;
import com.acme.banking.model.Meta;
import com.acme.banking.model.OBReadAccount6Data;
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
 * OBReadAccount6
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadAccount6 {

  private OBReadAccount6Data data;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Links links;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Meta meta;

  public OBReadAccount6() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadAccount6(OBReadAccount6Data data) {
    this.data = data;
  }

  public OBReadAccount6 data(OBReadAccount6Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull
  @Schema(name = "Data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Data")
  public OBReadAccount6Data getData() {
    return data;
  }

  @JsonProperty("Data")
  public void setData(OBReadAccount6Data data) {
    this.data = data;
  }

  public OBReadAccount6 links(@Nullable Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  
  @Schema(name = "Links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Links")
  public @Nullable Links getLinks() {
    return links;
  }

  @JsonProperty("Links")
  public void setLinks(@Nullable Links links) {
    this.links = links;
  }

  public OBReadAccount6 meta(@Nullable Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  
  @Schema(name = "Meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Meta")
  public @Nullable Meta getMeta() {
    return meta;
  }

  @JsonProperty("Meta")
  public void setMeta(@Nullable Meta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadAccount6 obReadAccount6 = (OBReadAccount6) o;
    return Objects.equals(this.data, obReadAccount6.data) &&
        Objects.equals(this.links, obReadAccount6.links) &&
        Objects.equals(this.meta, obReadAccount6.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadAccount6 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBCommunicationMethod;
import com.acme.banking.model.OBFileFormat;
import com.acme.banking.model.OBFrequency2;
import com.acme.banking.model.OBPostalAddress7;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Frequency and format of statements for an account
 */

@Schema(name = "StatementFrequencyAndFormat_inner", description = "Frequency and format of statements for an account")
@JsonTypeName("StatementFrequencyAndFormat_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class StatementFrequencyAndFormatInner {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBFrequency2 frequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBCommunicationMethod communicationMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBFileFormat format;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBPostalAddress7 deliveryAddress;

  public StatementFrequencyAndFormatInner frequency(@Nullable OBFrequency2 frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  
  @Schema(name = "Frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Frequency")
  public @Nullable OBFrequency2 getFrequency() {
    return frequency;
  }

  @JsonProperty("Frequency")
  public void setFrequency(@Nullable OBFrequency2 frequency) {
    this.frequency = frequency;
  }

  public StatementFrequencyAndFormatInner communicationMethod(@Nullable OBCommunicationMethod communicationMethod) {
    this.communicationMethod = communicationMethod;
    return this;
  }

  /**
   * Get communicationMethod
   * @return communicationMethod
   */
  
  @Schema(name = "CommunicationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CommunicationMethod")
  public @Nullable OBCommunicationMethod getCommunicationMethod() {
    return communicationMethod;
  }

  @JsonProperty("CommunicationMethod")
  public void setCommunicationMethod(@Nullable OBCommunicationMethod communicationMethod) {
    this.communicationMethod = communicationMethod;
  }

  public StatementFrequencyAndFormatInner format(@Nullable OBFileFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  
  @Schema(name = "Format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Format")
  public @Nullable OBFileFormat getFormat() {
    return format;
  }

  @JsonProperty("Format")
  public void setFormat(@Nullable OBFileFormat format) {
    this.format = format;
  }

  public StatementFrequencyAndFormatInner deliveryAddress(@Nullable OBPostalAddress7 deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
   */
  
  @Schema(name = "DeliveryAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryAddress")
  public @Nullable OBPostalAddress7 getDeliveryAddress() {
    return deliveryAddress;
  }

  @JsonProperty("DeliveryAddress")
  public void setDeliveryAddress(@Nullable OBPostalAddress7 deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementFrequencyAndFormatInner statementFrequencyAndFormatInner = (StatementFrequencyAndFormatInner) o;
    return Objects.equals(this.frequency, statementFrequencyAndFormatInner.frequency) &&
        Objects.equals(this.communicationMethod, statementFrequencyAndFormatInner.communicationMethod) &&
        Objects.equals(this.format, statementFrequencyAndFormatInner.format) &&
        Objects.equals(this.deliveryAddress, statementFrequencyAndFormatInner.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, communicationMethod, format, deliveryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementFrequencyAndFormatInner {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    communicationMethod: ").append(toIndentedString(communicationMethod)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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


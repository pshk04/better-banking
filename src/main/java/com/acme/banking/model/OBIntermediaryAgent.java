package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBPostalAddress7;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The intermediary agent associated with this transaction.
 */

@Schema(name = "OBIntermediaryAgent", description = "The intermediary agent associated with this transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBIntermediaryAgent {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String schemeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String identification;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String LEI;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBPostalAddress7 postalAddress;

  /**
   * Status of the payment at the Intermediary Agent. For a full list of enumeration values refer to `OBIntermediaryAgentStatus1Code` in `OB_Internal_CodeSet` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   */
  public enum ProcessingStatusEnum {
    PDNG("PDNG"),
    
    RCVD("RCVD"),
    
    ACSP("ACSP"),
    
    ACSC("ACSC"),
    
    RJCT("RJCT"),
    
    UNKN("UNKN"),
    
    CANC("CANC");

    private final String value;

    ProcessingStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingStatusEnum fromValue(String value) {
      for (ProcessingStatusEnum b : ProcessingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProcessingStatusEnum processingStatus;

  public OBIntermediaryAgent name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
   */
  
  @Schema(name = "Name", description = "Name by which an agent is known and which is usually used to identify that agent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("Name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OBIntermediaryAgent schemeName(@Nullable String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
   */
  
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SchemeName")
  public @Nullable String getSchemeName() {
    return schemeName;
  }

  @JsonProperty("SchemeName")
  public void setSchemeName(@Nullable String schemeName) {
    this.schemeName = schemeName;
  }

  public OBIntermediaryAgent identification(@Nullable String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public @Nullable String getIdentification() {
    return identification;
  }

  @JsonProperty("Identification")
  public void setIdentification(@Nullable String identification) {
    this.identification = identification;
  }

  public OBIntermediaryAgent LEI(@Nullable String LEI) {
    this.LEI = LEI;
    return this;
  }

  /**
   * Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
   * @return LEI
   */
  
  @Schema(name = "LEI", example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LEI")
  public @Nullable String getLEI() {
    return LEI;
  }

  @JsonProperty("LEI")
  public void setLEI(@Nullable String LEI) {
    this.LEI = LEI;
  }

  public OBIntermediaryAgent postalAddress(@Nullable OBPostalAddress7 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
   */
  
  @Schema(name = "PostalAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostalAddress")
  public @Nullable OBPostalAddress7 getPostalAddress() {
    return postalAddress;
  }

  @JsonProperty("PostalAddress")
  public void setPostalAddress(@Nullable OBPostalAddress7 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public OBIntermediaryAgent processingStatus(@Nullable ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * Status of the payment at the Intermediary Agent. For a full list of enumeration values refer to `OBIntermediaryAgentStatus1Code` in `OB_Internal_CodeSet` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return processingStatus
   */
  
  @Schema(name = "ProcessingStatus", description = "Status of the payment at the Intermediary Agent. For a full list of enumeration values refer to `OBIntermediaryAgentStatus1Code` in `OB_Internal_CodeSet` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProcessingStatus")
  public @Nullable ProcessingStatusEnum getProcessingStatus() {
    return processingStatus;
  }

  @JsonProperty("ProcessingStatus")
  public void setProcessingStatus(@Nullable ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBIntermediaryAgent obIntermediaryAgent = (OBIntermediaryAgent) o;
    return Objects.equals(this.name, obIntermediaryAgent.name) &&
        Objects.equals(this.schemeName, obIntermediaryAgent.schemeName) &&
        Objects.equals(this.identification, obIntermediaryAgent.identification) &&
        Objects.equals(this.LEI, obIntermediaryAgent.LEI) &&
        Objects.equals(this.postalAddress, obIntermediaryAgent.postalAddress) &&
        Objects.equals(this.processingStatus, obIntermediaryAgent.processingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, schemeName, identification, LEI, postalAddress, processingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBIntermediaryAgent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.ExternalCreditorReferenceType1Code;
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
 * Reference information provided by the creditor to allow the identification of the underlying documents.
 */

@Schema(name = "OBRemittanceInformationStructured_CreditorReferenceInformation", description = "Reference information provided by the creditor to allow the identification of the underlying documents.")
@JsonTypeName("OBRemittanceInformationStructured_CreditorReferenceInformation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBRemittanceInformationStructuredCreditorReferenceInformation {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ExternalCreditorReferenceType1Code code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String issuer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String reference;

  public OBRemittanceInformationStructuredCreditorReferenceInformation code(@Nullable ExternalCreditorReferenceType1Code code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public @Nullable ExternalCreditorReferenceType1Code getCode() {
    return code;
  }

  @JsonProperty("Code")
  public void setCode(@Nullable ExternalCreditorReferenceType1Code code) {
    this.code = code;
  }

  public OBRemittanceInformationStructuredCreditorReferenceInformation issuer(@Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Entity that assigns the identification.
   * @return issuer
   */
  
  @Schema(name = "Issuer", description = "Entity that assigns the identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Issuer")
  public @Nullable String getIssuer() {
    return issuer;
  }

  @JsonProperty("Issuer")
  public void setIssuer(@Nullable String issuer) {
    this.issuer = issuer;
  }

  public OBRemittanceInformationStructuredCreditorReferenceInformation reference(@Nullable String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.
   * @return reference
   */
  
  @Schema(name = "Reference", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reference")
  public @Nullable String getReference() {
    return reference;
  }

  @JsonProperty("Reference")
  public void setReference(@Nullable String reference) {
    this.reference = reference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRemittanceInformationStructuredCreditorReferenceInformation obRemittanceInformationStructuredCreditorReferenceInformation = (OBRemittanceInformationStructuredCreditorReferenceInformation) o;
    return Objects.equals(this.code, obRemittanceInformationStructuredCreditorReferenceInformation.code) &&
        Objects.equals(this.issuer, obRemittanceInformationStructuredCreditorReferenceInformation.issuer) &&
        Objects.equals(this.reference, obRemittanceInformationStructuredCreditorReferenceInformation.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRemittanceInformationStructuredCreditorReferenceInformation {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReferredDocumentInformation;
import com.acme.banking.model.OBRemittanceInformationStructuredCreditorReferenceInformation;
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
 * OBRemittanceInformationStructured
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBRemittanceInformationStructured {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OBReferredDocumentInformation> referredDocumentInformation = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String referredDocumentAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String invoicer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String invoicee;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String taxRemittance;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> additionalRemittanceInformation = new ArrayList<>();

  public OBRemittanceInformationStructured referredDocumentInformation(List<OBReferredDocumentInformation> referredDocumentInformation) {
    this.referredDocumentInformation = referredDocumentInformation;
    return this;
  }

  public OBRemittanceInformationStructured addReferredDocumentInformationItem(OBReferredDocumentInformation referredDocumentInformationItem) {
    if (this.referredDocumentInformation == null) {
      this.referredDocumentInformation = new ArrayList<>();
    }
    this.referredDocumentInformation.add(referredDocumentInformationItem);
    return this;
  }

  /**
   * Get referredDocumentInformation
   * @return referredDocumentInformation
   */
  
  @Schema(name = "ReferredDocumentInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReferredDocumentInformation")
  public List<OBReferredDocumentInformation> getReferredDocumentInformation() {
    return referredDocumentInformation;
  }

  @JsonProperty("ReferredDocumentInformation")
  public void setReferredDocumentInformation(List<OBReferredDocumentInformation> referredDocumentInformation) {
    this.referredDocumentInformation = referredDocumentInformation;
  }

  public OBRemittanceInformationStructured referredDocumentAmount(@Nullable String referredDocumentAmount) {
    this.referredDocumentAmount = referredDocumentAmount;
    return this;
  }

  /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return referredDocumentAmount
   */
  
  @Schema(name = "ReferredDocumentAmount", example = "1209.06", description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReferredDocumentAmount")
  public @Nullable String getReferredDocumentAmount() {
    return referredDocumentAmount;
  }

  @JsonProperty("ReferredDocumentAmount")
  public void setReferredDocumentAmount(@Nullable String referredDocumentAmount) {
    this.referredDocumentAmount = referredDocumentAmount;
  }

  public OBRemittanceInformationStructured creditorReferenceInformation(@Nullable OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
    this.creditorReferenceInformation = creditorReferenceInformation;
    return this;
  }

  /**
   * Get creditorReferenceInformation
   * @return creditorReferenceInformation
   */
  
  @Schema(name = "CreditorReferenceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditorReferenceInformation")
  public @Nullable OBRemittanceInformationStructuredCreditorReferenceInformation getCreditorReferenceInformation() {
    return creditorReferenceInformation;
  }

  @JsonProperty("CreditorReferenceInformation")
  public void setCreditorReferenceInformation(@Nullable OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
    this.creditorReferenceInformation = creditorReferenceInformation;
  }

  public OBRemittanceInformationStructured invoicer(@Nullable String invoicer) {
    this.invoicer = invoicer;
    return this;
  }

  /**
   * Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor
   * @return invoicer
   */
  
  @Schema(name = "Invoicer", example = "80200112344562", description = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Invoicer")
  public @Nullable String getInvoicer() {
    return invoicer;
  }

  @JsonProperty("Invoicer")
  public void setInvoicer(@Nullable String invoicer) {
    this.invoicer = invoicer;
  }

  public OBRemittanceInformationStructured invoicee(@Nullable String invoicee) {
    this.invoicee = invoicee;
    return this;
  }

  /**
   * Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.
   * @return invoicee
   */
  
  @Schema(name = "Invoicee", example = "80200112344562", description = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Invoicee")
  public @Nullable String getInvoicee() {
    return invoicee;
  }

  @JsonProperty("Invoicee")
  public void setInvoicee(@Nullable String invoicee) {
    this.invoicee = invoicee;
  }

  public OBRemittanceInformationStructured taxRemittance(@Nullable String taxRemittance) {
    this.taxRemittance = taxRemittance;
    return this;
  }

  /**
   * Provides remittance information about a payment made for tax-related purposes.
   * @return taxRemittance
   */
  
  @Schema(name = "TaxRemittance", description = "Provides remittance information about a payment made for tax-related purposes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TaxRemittance")
  public @Nullable String getTaxRemittance() {
    return taxRemittance;
  }

  @JsonProperty("TaxRemittance")
  public void setTaxRemittance(@Nullable String taxRemittance) {
    this.taxRemittance = taxRemittance;
  }

  public OBRemittanceInformationStructured additionalRemittanceInformation(List<String> additionalRemittanceInformation) {
    this.additionalRemittanceInformation = additionalRemittanceInformation;
    return this;
  }

  public OBRemittanceInformationStructured addAdditionalRemittanceInformationItem(String additionalRemittanceInformationItem) {
    if (this.additionalRemittanceInformation == null) {
      this.additionalRemittanceInformation = new ArrayList<>();
    }
    this.additionalRemittanceInformation.add(additionalRemittanceInformationItem);
    return this;
  }

  /**
   * Additional information, in free text form, to complement the structured remittance information.
   * @return additionalRemittanceInformation
   */
  
  @Schema(name = "AdditionalRemittanceInformation", description = "Additional information, in free text form, to complement the structured remittance information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AdditionalRemittanceInformation")
  public List<String> getAdditionalRemittanceInformation() {
    return additionalRemittanceInformation;
  }

  @JsonProperty("AdditionalRemittanceInformation")
  public void setAdditionalRemittanceInformation(List<String> additionalRemittanceInformation) {
    this.additionalRemittanceInformation = additionalRemittanceInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRemittanceInformationStructured obRemittanceInformationStructured = (OBRemittanceInformationStructured) o;
    return Objects.equals(this.referredDocumentInformation, obRemittanceInformationStructured.referredDocumentInformation) &&
        Objects.equals(this.referredDocumentAmount, obRemittanceInformationStructured.referredDocumentAmount) &&
        Objects.equals(this.creditorReferenceInformation, obRemittanceInformationStructured.creditorReferenceInformation) &&
        Objects.equals(this.invoicer, obRemittanceInformationStructured.invoicer) &&
        Objects.equals(this.invoicee, obRemittanceInformationStructured.invoicee) &&
        Objects.equals(this.taxRemittance, obRemittanceInformationStructured.taxRemittance) &&
        Objects.equals(this.additionalRemittanceInformation, obRemittanceInformationStructured.additionalRemittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredDocumentInformation, referredDocumentAmount, creditorReferenceInformation, invoicer, invoicee, taxRemittance, additionalRemittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRemittanceInformationStructured {\n");
    sb.append("    referredDocumentInformation: ").append(toIndentedString(referredDocumentInformation)).append("\n");
    sb.append("    referredDocumentAmount: ").append(toIndentedString(referredDocumentAmount)).append("\n");
    sb.append("    creditorReferenceInformation: ").append(toIndentedString(creditorReferenceInformation)).append("\n");
    sb.append("    invoicer: ").append(toIndentedString(invoicer)).append("\n");
    sb.append("    invoicee: ").append(toIndentedString(invoicee)).append("\n");
    sb.append("    taxRemittance: ").append(toIndentedString(taxRemittance)).append("\n");
    sb.append("    additionalRemittanceInformation: ").append(toIndentedString(additionalRemittanceInformation)).append("\n");
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


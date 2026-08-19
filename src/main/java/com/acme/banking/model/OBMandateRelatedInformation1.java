package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.ExternalCategoryPurpose1Code;
import com.acme.banking.model.OBExternalMandateClassification1Code;
import com.acme.banking.model.OBFrequency6;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Provides further details of the mandate signed between the creditor and the debtor.
 */

@Schema(name = "OBMandateRelatedInformation1", description = "Provides further details of the mandate signed between the creditor and the debtor.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBMandateRelatedInformation1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String mandateIdentification;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBExternalMandateClassification1Code classification;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ExternalCategoryPurpose1Code categoryPurposeCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date firstPaymentDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date recurringPaymentDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date finalPaymentDateTime;

  private OBFrequency6 frequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String reason;

  public OBMandateRelatedInformation1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBMandateRelatedInformation1(OBFrequency6 frequency) {
    this.frequency = frequency;
  }

  public OBMandateRelatedInformation1 mandateIdentification(@Nullable String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Unique identification, as assigned by the creditor, to unambiguously identify the mandate.
   * @return mandateIdentification
   */
  
  @Schema(name = "MandateIdentification", example = "Golfers", description = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MandateIdentification")
  public @Nullable String getMandateIdentification() {
    return mandateIdentification;
  }

  @JsonProperty("MandateIdentification")
  public void setMandateIdentification(@Nullable String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBMandateRelatedInformation1 classification(@Nullable OBExternalMandateClassification1Code classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
   */
  
  @Schema(name = "Classification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Classification")
  public @Nullable OBExternalMandateClassification1Code getClassification() {
    return classification;
  }

  @JsonProperty("Classification")
  public void setClassification(@Nullable OBExternalMandateClassification1Code classification) {
    this.classification = classification;
  }

  public OBMandateRelatedInformation1 categoryPurposeCode(@Nullable ExternalCategoryPurpose1Code categoryPurposeCode) {
    this.categoryPurposeCode = categoryPurposeCode;
    return this;
  }

  /**
   * Get categoryPurposeCode
   * @return categoryPurposeCode
   */
  
  @Schema(name = "CategoryPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryPurposeCode")
  public @Nullable ExternalCategoryPurpose1Code getCategoryPurposeCode() {
    return categoryPurposeCode;
  }

  @JsonProperty("CategoryPurposeCode")
  public void setCategoryPurposeCode(@Nullable ExternalCategoryPurpose1Code categoryPurposeCode) {
    this.categoryPurposeCode = categoryPurposeCode;
  }

  public OBMandateRelatedInformation1 firstPaymentDateTime(@Nullable Date firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first payment for a recurrent credit transfer will be made.
   * @return firstPaymentDateTime
   */
  
  @Schema(name = "FirstPaymentDateTime", example = "2024-04-25T12:46:49.425Z", description = "The date on which the first payment for a recurrent credit transfer will be made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FirstPaymentDateTime")
  public @Nullable Date getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  @JsonProperty("FirstPaymentDateTime")
  public void setFirstPaymentDateTime(@Nullable Date firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBMandateRelatedInformation1 recurringPaymentDateTime(@Nullable Date recurringPaymentDateTime) {
    this.recurringPaymentDateTime = recurringPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return recurringPaymentDateTime
   */
  
  @Schema(name = "RecurringPaymentDateTime", example = "2024-04-25T12:46:49.425Z", description = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecurringPaymentDateTime")
  public @Nullable Date getRecurringPaymentDateTime() {
    return recurringPaymentDateTime;
  }

  @JsonProperty("RecurringPaymentDateTime")
  public void setRecurringPaymentDateTime(@Nullable Date recurringPaymentDateTime) {
    this.recurringPaymentDateTime = recurringPaymentDateTime;
  }

  public OBMandateRelatedInformation1 finalPaymentDateTime(@Nullable Date finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * The date on which the final payment for a recurrent credit transfer will be made.
   * @return finalPaymentDateTime
   */
  
  @Schema(name = "FinalPaymentDateTime", example = "2024-04-25T12:46:49.425Z", description = "The date on which the final payment for a recurrent credit transfer will be made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FinalPaymentDateTime")
  public @Nullable Date getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  @JsonProperty("FinalPaymentDateTime")
  public void setFinalPaymentDateTime(@Nullable Date finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBMandateRelatedInformation1 frequency(OBFrequency6 frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @NotNull
  @Schema(name = "Frequency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Frequency")
  public OBFrequency6 getFrequency() {
    return frequency;
  }

  @JsonProperty("Frequency")
  public void setFrequency(OBFrequency6 frequency) {
    this.frequency = frequency;
  }

  public OBMandateRelatedInformation1 reason(@Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the setup of the credit transfer mandate.
   * @return reason
   */
  
  @Schema(name = "Reason", example = "To pay monthly membership", description = "Reason for the setup of the credit transfer mandate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reason")
  public @Nullable String getReason() {
    return reason;
  }

  @JsonProperty("Reason")
  public void setReason(@Nullable String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMandateRelatedInformation1 obMandateRelatedInformation1 = (OBMandateRelatedInformation1) o;
    return Objects.equals(this.mandateIdentification, obMandateRelatedInformation1.mandateIdentification) &&
        Objects.equals(this.classification, obMandateRelatedInformation1.classification) &&
        Objects.equals(this.categoryPurposeCode, obMandateRelatedInformation1.categoryPurposeCode) &&
        Objects.equals(this.firstPaymentDateTime, obMandateRelatedInformation1.firstPaymentDateTime) &&
        Objects.equals(this.recurringPaymentDateTime, obMandateRelatedInformation1.recurringPaymentDateTime) &&
        Objects.equals(this.finalPaymentDateTime, obMandateRelatedInformation1.finalPaymentDateTime) &&
        Objects.equals(this.frequency, obMandateRelatedInformation1.frequency) &&
        Objects.equals(this.reason, obMandateRelatedInformation1.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateIdentification, classification, categoryPurposeCode, firstPaymentDateTime, recurringPaymentDateTime, finalPaymentDateTime, frequency, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBMandateRelatedInformation1 {\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    categoryPurposeCode: ").append(toIndentedString(categoryPurposeCode)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    recurringPaymentDateTime: ").append(toIndentedString(recurringPaymentDateTime)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


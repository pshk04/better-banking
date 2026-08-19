package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.ExternalMandateStatus1Code;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount0;
import com.acme.banking.model.OBMandateRelatedInformation1;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Account to or from which a cash entry is made.
 */

@Schema(name = "OBReadDirectDebit2_Data_DirectDebit_inner", description = "Account to or from which a cash entry is made.")
@JsonTypeName("OBReadDirectDebit2_Data_DirectDebit_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadDirectDebit2DataDirectDebitInner {

  private String accountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String directDebitId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ExternalMandateStatus1Code directDebitStatusCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBMandateRelatedInformation1 mandateRelatedInformation;

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date previousPaymentDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount;

  public OBReadDirectDebit2DataDirectDebitInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadDirectDebit2DataDirectDebitInner(String accountId, String name) {
    this.accountId = accountId;
    this.name = name;
  }

  public OBReadDirectDebit2DataDirectDebitInner accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
   */
  @NotNull
  @Schema(name = "AccountId", example = "22289", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty("AccountId")
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadDirectDebit2DataDirectDebitInner directDebitId(@Nullable String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
   */
  
  @Schema(name = "DirectDebitId", description = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectDebitId")
  public @Nullable String getDirectDebitId() {
    return directDebitId;
  }

  @JsonProperty("DirectDebitId")
  public void setDirectDebitId(@Nullable String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBReadDirectDebit2DataDirectDebitInner directDebitStatusCode(@Nullable ExternalMandateStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

  /**
   * Get directDebitStatusCode
   * @return directDebitStatusCode
   */
  
  @Schema(name = "DirectDebitStatusCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectDebitStatusCode")
  public @Nullable ExternalMandateStatus1Code getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  @JsonProperty("DirectDebitStatusCode")
  public void setDirectDebitStatusCode(@Nullable ExternalMandateStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBReadDirectDebit2DataDirectDebitInner mandateRelatedInformation(@Nullable OBMandateRelatedInformation1 mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
    return this;
  }

  /**
   * Get mandateRelatedInformation
   * @return mandateRelatedInformation
   */
  
  @Schema(name = "MandateRelatedInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MandateRelatedInformation")
  public @Nullable OBMandateRelatedInformation1 getMandateRelatedInformation() {
    return mandateRelatedInformation;
  }

  @JsonProperty("MandateRelatedInformation")
  public void setMandateRelatedInformation(@Nullable OBMandateRelatedInformation1 mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
  }

  public OBReadDirectDebit2DataDirectDebitInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Service User.
   * @return name
   */
  @NotNull
  @Schema(name = "Name", description = "Name of Service User.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  @JsonProperty("Name")
  public void setName(String name) {
    this.name = name;
  }

  public OBReadDirectDebit2DataDirectDebitInner previousPaymentDateTime(@Nullable Date previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

  /**
   * Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
   */
  
  @Schema(name = "PreviousPaymentDateTime", description = "Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreviousPaymentDateTime")
  public @Nullable Date getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  @JsonProperty("PreviousPaymentDateTime")
  public void setPreviousPaymentDateTime(@Nullable Date previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBReadDirectDebit2DataDirectDebitInner previousPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

  /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
   */
  
  @Schema(name = "PreviousPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreviousPaymentAmount")
  public @Nullable OBActiveOrHistoricCurrencyAndAmount0 getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  @JsonProperty("PreviousPaymentAmount")
  public void setPreviousPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2DataDirectDebitInner obReadDirectDebit2DataDirectDebitInner = (OBReadDirectDebit2DataDirectDebitInner) o;
    return Objects.equals(this.accountId, obReadDirectDebit2DataDirectDebitInner.accountId) &&
        Objects.equals(this.directDebitId, obReadDirectDebit2DataDirectDebitInner.directDebitId) &&
        Objects.equals(this.directDebitStatusCode, obReadDirectDebit2DataDirectDebitInner.directDebitStatusCode) &&
        Objects.equals(this.mandateRelatedInformation, obReadDirectDebit2DataDirectDebitInner.mandateRelatedInformation) &&
        Objects.equals(this.name, obReadDirectDebit2DataDirectDebitInner.name) &&
        Objects.equals(this.previousPaymentDateTime, obReadDirectDebit2DataDirectDebitInner.previousPaymentDateTime) &&
        Objects.equals(this.previousPaymentAmount, obReadDirectDebit2DataDirectDebitInner.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, directDebitStatusCode, mandateRelatedInformation, name, previousPaymentDateTime, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2DataDirectDebitInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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


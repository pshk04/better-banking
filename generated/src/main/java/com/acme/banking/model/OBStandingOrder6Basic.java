package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.ExternalMandateStatus1Code;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount11;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount2;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount3;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount4;
import com.acme.banking.model.OBMandateRelatedInformation1;
import com.acme.banking.model.OBRemittanceInformation2;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBStandingOrder6Basic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBStandingOrder6Basic {

  private String accountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String standingOrderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date nextPaymentDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date lastPaymentDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String numberOfPayments;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ExternalMandateStatus1Code standingOrderStatusCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Map<String, Object> supplementaryData = new HashMap<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBMandateRelatedInformation1 mandateRelatedInformation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBRemittanceInformation2 remittanceInformation;

  public OBStandingOrder6Basic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStandingOrder6Basic(String accountId) {
    this.accountId = accountId;
  }

  public OBStandingOrder6Basic accountId(String accountId) {
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

  public OBStandingOrder6Basic standingOrderId(@Nullable String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
   * @return standingOrderId
   */
  
  @Schema(name = "StandingOrderId", example = "Ben5", description = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrderId")
  public @Nullable String getStandingOrderId() {
    return standingOrderId;
  }

  @JsonProperty("StandingOrderId")
  public void setStandingOrderId(@Nullable String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder6Basic nextPaymentDateTime(@Nullable Date nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

  /**
   * The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return nextPaymentDateTime
   */
  
  @Schema(name = "NextPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NextPaymentDateTime")
  public @Nullable Date getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  @JsonProperty("NextPaymentDateTime")
  public void setNextPaymentDateTime(@Nullable Date nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder6Basic lastPaymentDateTime(@Nullable Date lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
    return this;
  }

  /**
   * The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastPaymentDateTime
   */
  
  @Schema(name = "LastPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastPaymentDateTime")
  public @Nullable Date getLastPaymentDateTime() {
    return lastPaymentDateTime;
  }

  @JsonProperty("LastPaymentDateTime")
  public void setLastPaymentDateTime(@Nullable Date lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
  }

  public OBStandingOrder6Basic numberOfPayments(@Nullable String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
   * @return numberOfPayments
   */
  
  @Schema(name = "NumberOfPayments", description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumberOfPayments")
  public @Nullable String getNumberOfPayments() {
    return numberOfPayments;
  }

  @JsonProperty("NumberOfPayments")
  public void setNumberOfPayments(@Nullable String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public OBStandingOrder6Basic standingOrderStatusCode(@Nullable ExternalMandateStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

  /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
   */
  
  @Schema(name = "StandingOrderStatusCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrderStatusCode")
  public @Nullable ExternalMandateStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  @JsonProperty("StandingOrderStatusCode")
  public void setStandingOrderStatusCode(@Nullable ExternalMandateStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder6Basic firstPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

  /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
   */
  
  @Schema(name = "FirstPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FirstPaymentAmount")
  public @Nullable OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  @JsonProperty("FirstPaymentAmount")
  public void setFirstPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder6Basic nextPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
   */
  
  @Schema(name = "NextPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NextPaymentAmount")
  public @Nullable OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  @JsonProperty("NextPaymentAmount")
  public void setNextPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder6Basic lastPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * Get lastPaymentAmount
   * @return lastPaymentAmount
   */
  
  @Schema(name = "LastPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastPaymentAmount")
  public @Nullable OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  @JsonProperty("LastPaymentAmount")
  public void setLastPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public OBStandingOrder6Basic finalPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

  /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
   */
  
  @Schema(name = "FinalPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FinalPaymentAmount")
  public @Nullable OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  @JsonProperty("FinalPaymentAmount")
  public void setFinalPaymentAmount(@Nullable OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder6Basic supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBStandingOrder6Basic putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
   */
  
  @Schema(name = "SupplementaryData", description = "Additional information that can not be captured in the structured fields and/or any other specific block.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupplementaryData")
  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  @JsonProperty("SupplementaryData")
  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBStandingOrder6Basic mandateRelatedInformation(@Nullable OBMandateRelatedInformation1 mandateRelatedInformation) {
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

  public OBStandingOrder6Basic remittanceInformation(@Nullable OBRemittanceInformation2 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

  /**
   * Get remittanceInformation
   * @return remittanceInformation
   */
  
  @Schema(name = "RemittanceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemittanceInformation")
  public @Nullable OBRemittanceInformation2 getRemittanceInformation() {
    return remittanceInformation;
  }

  @JsonProperty("RemittanceInformation")
  public void setRemittanceInformation(@Nullable OBRemittanceInformation2 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStandingOrder6Basic obStandingOrder6Basic = (OBStandingOrder6Basic) o;
    return Objects.equals(this.accountId, obStandingOrder6Basic.accountId) &&
        Objects.equals(this.standingOrderId, obStandingOrder6Basic.standingOrderId) &&
        Objects.equals(this.nextPaymentDateTime, obStandingOrder6Basic.nextPaymentDateTime) &&
        Objects.equals(this.lastPaymentDateTime, obStandingOrder6Basic.lastPaymentDateTime) &&
        Objects.equals(this.numberOfPayments, obStandingOrder6Basic.numberOfPayments) &&
        Objects.equals(this.standingOrderStatusCode, obStandingOrder6Basic.standingOrderStatusCode) &&
        Objects.equals(this.firstPaymentAmount, obStandingOrder6Basic.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentAmount, obStandingOrder6Basic.nextPaymentAmount) &&
        Objects.equals(this.lastPaymentAmount, obStandingOrder6Basic.lastPaymentAmount) &&
        Objects.equals(this.finalPaymentAmount, obStandingOrder6Basic.finalPaymentAmount) &&
        Objects.equals(this.supplementaryData, obStandingOrder6Basic.supplementaryData) &&
        Objects.equals(this.mandateRelatedInformation, obStandingOrder6Basic.mandateRelatedInformation) &&
        Objects.equals(this.remittanceInformation, obStandingOrder6Basic.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, nextPaymentDateTime, lastPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, supplementaryData, mandateRelatedInformation, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder6Basic {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount1;
import com.acme.banking.model.OBBranchAndFinancialInstitutionIdentification51;
import com.acme.banking.model.OBCashAccount51;
import com.acme.banking.model.OBInternalScheduleType1Code;
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
 * OBScheduledPayment3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBScheduledPayment3 {

  private String accountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String scheduledPaymentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date scheduledPaymentDateTime;

  private OBInternalScheduleType1Code scheduledType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String reference;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String debtorReference;

  private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBBranchAndFinancialInstitutionIdentification51 creditorAgent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBCashAccount51 creditorAccount;

  public OBScheduledPayment3() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBScheduledPayment3(String accountId, Date scheduledPaymentDateTime, OBInternalScheduleType1Code scheduledType, OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.accountId = accountId;
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    this.scheduledType = scheduledType;
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment3 accountId(String accountId) {
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

  public OBScheduledPayment3 scheduledPaymentId(@Nullable String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
   * @return scheduledPaymentId
   */
  
  @Schema(name = "ScheduledPaymentId", example = "SP03", description = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScheduledPaymentId")
  public @Nullable String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  @JsonProperty("ScheduledPaymentId")
  public void setScheduledPaymentId(@Nullable String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment3 scheduledPaymentDateTime(Date scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return scheduledPaymentDateTime
   */
  @NotNull
  @Schema(name = "ScheduledPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ScheduledPaymentDateTime")
  public Date getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  @JsonProperty("ScheduledPaymentDateTime")
  public void setScheduledPaymentDateTime(Date scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment3 scheduledType(OBInternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
   */
  @NotNull
  @Schema(name = "ScheduledType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ScheduledType")
  public OBInternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  @JsonProperty("ScheduledType")
  public void setScheduledType(OBInternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }

  public OBScheduledPayment3 reference(@Nullable String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
   */
  
  @Schema(name = "Reference", example = "Towbar Club", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reference")
  public @Nullable String getReference() {
    return reference;
  }

  @JsonProperty("Reference")
  public void setReference(@Nullable String reference) {
    this.reference = reference;
  }

  public OBScheduledPayment3 debtorReference(@Nullable String debtorReference) {
    this.debtorReference = debtorReference;
    return this;
  }

  /**
   * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
   * @return debtorReference
   */
  
  @Schema(name = "DebtorReference", example = "REF51561806", description = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DebtorReference")
  public @Nullable String getDebtorReference() {
    return debtorReference;
  }

  @JsonProperty("DebtorReference")
  public void setDebtorReference(@Nullable String debtorReference) {
    this.debtorReference = debtorReference;
  }

  public OBScheduledPayment3 instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
   */
  @NotNull
  @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstructedAmount")
  public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
    return instructedAmount;
  }

  @JsonProperty("InstructedAmount")
  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment3 creditorAgent(@Nullable OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
   */
  
  @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditorAgent")
  public @Nullable OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }

  @JsonProperty("CreditorAgent")
  public void setCreditorAgent(@Nullable OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBScheduledPayment3 creditorAccount(@Nullable OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
   */
  
  @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditorAccount")
  public @Nullable OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  @JsonProperty("CreditorAccount")
  public void setCreditorAccount(@Nullable OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment3 obScheduledPayment3 = (OBScheduledPayment3) o;
    return Objects.equals(this.accountId, obScheduledPayment3.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment3.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment3.scheduledType) &&
        Objects.equals(this.reference, obScheduledPayment3.reference) &&
        Objects.equals(this.debtorReference, obScheduledPayment3.debtorReference) &&
        Objects.equals(this.instructedAmount, obScheduledPayment3.instructedAmount) &&
        Objects.equals(this.creditorAgent, obScheduledPayment3.creditorAgent) &&
        Objects.equals(this.creditorAccount, obScheduledPayment3.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment3 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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


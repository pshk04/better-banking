package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount7;
import com.acme.banking.model.OBCreditDebitCode0;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementInterest_inner", description = "Set of elements used to provide details of a generic interest amount related to the statement resource.")
@JsonTypeName("OBStatement2_StatementInterest_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBStatement2StatementInterestInner {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  private OBCreditDebitCode0 creditDebitIndicator;

  private String type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal rate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String rateType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String frequency;

  private OBActiveOrHistoricCurrencyAndAmount7 amount;

  public OBStatement2StatementInterestInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementInterestInner(OBCreditDebitCode0 creditDebitIndicator, String type, OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.creditDebitIndicator = creditDebitIndicator;
    this.type = type;
    this.amount = amount;
  }

  public OBStatement2StatementInterestInner description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description that may be available for the statement interest.
   * @return description
   */
  
  @Schema(name = "Description", example = "Interest occurred over statement duration", description = "Description that may be available for the statement interest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("Description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public OBStatement2StatementInterestInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
   */
  @NotNull
  @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreditDebitIndicator")
  public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  @JsonProperty("CreditDebitIndicator")
  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementInterestInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Interest amount type, in a coded form. For a full list of values see `OBInternalStatementInterestType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return type
   */
  @NotNull
  @Schema(name = "Type", example = "UK.OBIE.Total", description = "Interest amount type, in a coded form. For a full list of values see `OBInternalStatementInterestType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  @JsonProperty("Type")
  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementInterestInner rate(@Nullable BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate for Statement Interest (where it is applicable in terms of a rate rather than an amount)
   * @return rate
   */
  
  @Schema(name = "Rate", example = "0.05", description = "Rate for Statement Interest (where it is applicable in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Rate")
  public @Nullable BigDecimal getRate() {
    return rate;
  }

  @JsonProperty("Rate")
  public void setRate(@Nullable BigDecimal rate) {
    this.rate = rate;
  }

  public OBStatement2StatementInterestInner rateType(@Nullable String rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * This code specifies the type of interest (e.g., BOE Base Rate, Fixed Rate, Gross).
   * @return rateType
   */
  
  @Schema(name = "RateType", example = "UK.OBIE.FixedRate", description = "This code specifies the type of interest (e.g., BOE Base Rate, Fixed Rate, Gross).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RateType")
  public @Nullable String getRateType() {
    return rateType;
  }

  @JsonProperty("RateType")
  public void setRateType(@Nullable String rateType) {
    this.rateType = rateType;
  }

  public OBStatement2StatementInterestInner frequency(@Nullable String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Specifies the statement fee type requested. For a full list of values see `OBInternalStatementInterestFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return frequency
   */
  
  @Schema(name = "Frequency", example = "UK.OBIE.Monthly", description = "Specifies the statement fee type requested. For a full list of values see `OBInternalStatementInterestFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Frequency")
  public @Nullable String getFrequency() {
    return frequency;
  }

  @JsonProperty("Frequency")
  public void setFrequency(@Nullable String frequency) {
    this.frequency = frequency;
  }

  public OBStatement2StatementInterestInner amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @NotNull
  @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Amount")
  public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
    return amount;
  }

  @JsonProperty("Amount")
  public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementInterestInner obStatement2StatementInterestInner = (OBStatement2StatementInterestInner) o;
    return Objects.equals(this.description, obStatement2StatementInterestInner.description) &&
        Objects.equals(this.creditDebitIndicator, obStatement2StatementInterestInner.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementInterestInner.type) &&
        Objects.equals(this.rate, obStatement2StatementInterestInner.rate) &&
        Objects.equals(this.rateType, obStatement2StatementInterestInner.rateType) &&
        Objects.equals(this.frequency, obStatement2StatementInterestInner.frequency) &&
        Objects.equals(this.amount, obStatement2StatementInterestInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementInterestInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBExternalBalanceSubType1Code;
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
 * Amount of money associated with the amount type.
 */

@Schema(name = "OBActiveOrHistoricCurrencyAndAmount_8", description = "Amount of money associated with the amount type.")
@JsonTypeName("OBActiveOrHistoricCurrencyAndAmount_8")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBActiveOrHistoricCurrencyAndAmount8 {

  private String amount;

  private String currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBExternalBalanceSubType1Code subType;

  public OBActiveOrHistoricCurrencyAndAmount8() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBActiveOrHistoricCurrencyAndAmount8(String amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public OBActiveOrHistoricCurrencyAndAmount8 amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
   */
  @NotNull
  @Schema(name = "Amount", example = "1209.06", description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Amount")
  public String getAmount() {
    return amount;
  }

  @JsonProperty("Amount")
  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBActiveOrHistoricCurrencyAndAmount8 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
   * @return currency
   */
  @NotNull
  @Schema(name = "Currency", example = "GBP", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("Currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBActiveOrHistoricCurrencyAndAmount8 subType(@Nullable OBExternalBalanceSubType1Code subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
   */
  
  @Schema(name = "SubType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubType")
  public @Nullable OBExternalBalanceSubType1Code getSubType() {
    return subType;
  }

  @JsonProperty("SubType")
  public void setSubType(@Nullable OBExternalBalanceSubType1Code subType) {
    this.subType = subType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBActiveOrHistoricCurrencyAndAmount8 obActiveOrHistoricCurrencyAndAmount8 = (OBActiveOrHistoricCurrencyAndAmount8) o;
    return Objects.equals(this.amount, obActiveOrHistoricCurrencyAndAmount8.amount) &&
        Objects.equals(this.currency, obActiveOrHistoricCurrencyAndAmount8.currency) &&
        Objects.equals(this.subType, obActiveOrHistoricCurrencyAndAmount8.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBActiveOrHistoricCurrencyAndAmount8 {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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


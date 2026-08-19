package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
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
 * Optional component providing the equivalent of Amount in local currency.
 */

@Schema(name = "OBStatement2_StatementAmount_inner_LocalAmount", description = "Optional component providing the equivalent of Amount in local currency.")
@JsonTypeName("OBStatement2_StatementAmount_inner_LocalAmount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBStatement2StatementAmountInnerLocalAmount {

  private String amount;

  private String currency;

  /**
   * The amount in the local market currency for which the asset is held. Default is Local Currency (LCUR) if not specified
   */
  public enum SubTypeEnum {
    BCUR("BCUR"),
    
    LCUR("LCUR");

    private final String value;

    SubTypeEnum(String value) {
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
    public static SubTypeEnum fromValue(String value) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private SubTypeEnum subType = SubTypeEnum.LCUR;

  public OBStatement2StatementAmountInnerLocalAmount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementAmountInnerLocalAmount(String amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public OBStatement2StatementAmountInnerLocalAmount amount(String amount) {
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

  public OBStatement2StatementAmountInnerLocalAmount currency(String currency) {
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

  public OBStatement2StatementAmountInnerLocalAmount subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }

  /**
   * The amount in the local market currency for which the asset is held. Default is Local Currency (LCUR) if not specified
   * @return subType
   */
  
  @Schema(name = "SubType", description = "The amount in the local market currency for which the asset is held. Default is Local Currency (LCUR) if not specified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubType")
  public SubTypeEnum getSubType() {
    return subType;
  }

  @JsonProperty("SubType")
  public void setSubType(SubTypeEnum subType) {
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
    OBStatement2StatementAmountInnerLocalAmount obStatement2StatementAmountInnerLocalAmount = (OBStatement2StatementAmountInnerLocalAmount) o;
    return Objects.equals(this.amount, obStatement2StatementAmountInnerLocalAmount.amount) &&
        Objects.equals(this.currency, obStatement2StatementAmountInnerLocalAmount.currency) &&
        Objects.equals(this.subType, obStatement2StatementAmountInnerLocalAmount.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementAmountInnerLocalAmount {\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadConsent1Data
 */

@JsonTypeName("OBReadConsent1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadConsent1Data {

  /**
   * Specifies the Open Banking account access data types. <br /> This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP. <br /> For a full list of enumeration values refer to `OBInternalPermissions1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
   */
  public enum PermissionsEnum {
    READ_ACCOUNTS_BASIC("ReadAccountsBasic"),
    
    READ_ACCOUNTS_DETAIL("ReadAccountsDetail"),
    
    READ_BALANCES("ReadBalances"),
    
    READ_BENEFICIARIES_BASIC("ReadBeneficiariesBasic"),
    
    READ_BENEFICIARIES_DETAIL("ReadBeneficiariesDetail"),
    
    READ_DIRECT_DEBITS("ReadDirectDebits"),
    
    READ_OFFERS("ReadOffers"),
    
    READ_PAN("ReadPAN"),
    
    READ_PARTY("ReadParty"),
    
    READ_PARTY_PSU("ReadPartyPSU"),
    
    READ_PRODUCTS("ReadProducts"),
    
    READ_SCHEDULED_PAYMENTS_BASIC("ReadScheduledPaymentsBasic"),
    
    READ_SCHEDULED_PAYMENTS_DETAIL("ReadScheduledPaymentsDetail"),
    
    READ_STANDING_ORDERS_BASIC("ReadStandingOrdersBasic"),
    
    READ_STANDING_ORDERS_DETAIL("ReadStandingOrdersDetail"),
    
    READ_STATEMENTS_BASIC("ReadStatementsBasic"),
    
    READ_STATEMENTS_DETAIL("ReadStatementsDetail"),
    
    READ_TRANSACTIONS_BASIC("ReadTransactionsBasic"),
    
    READ_TRANSACTIONS_CREDITS("ReadTransactionsCredits"),
    
    READ_TRANSACTIONS_DEBITS("ReadTransactionsDebits"),
    
    READ_TRANSACTIONS_DETAIL("ReadTransactionsDetail");

    private final String value;

    PermissionsEnum(String value) {
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
    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private List<PermissionsEnum> permissions = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date expirationDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date transactionFromDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date transactionToDateTime;

  public OBReadConsent1Data() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadConsent1Data(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsent1Data permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsent1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @NotNull
  @Schema(name = "Permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Permissions")
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  @JsonProperty("Permissions")
  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsent1Data expirationDateTime(@Nullable Date expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
   */
  
  @Schema(name = "ExpirationDateTime", description = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExpirationDateTime")
  public @Nullable Date getExpirationDateTime() {
    return expirationDateTime;
  }

  @JsonProperty("ExpirationDateTime")
  public void setExpirationDateTime(@Nullable Date expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBReadConsent1Data transactionFromDateTime(@Nullable Date transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

  /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
   */
  
  @Schema(name = "TransactionFromDateTime", description = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionFromDateTime")
  public @Nullable Date getTransactionFromDateTime() {
    return transactionFromDateTime;
  }

  @JsonProperty("TransactionFromDateTime")
  public void setTransactionFromDateTime(@Nullable Date transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }

  public OBReadConsent1Data transactionToDateTime(@Nullable Date transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

  /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
   */
  
  @Schema(name = "TransactionToDateTime", description = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionToDateTime")
  public @Nullable Date getTransactionToDateTime() {
    return transactionToDateTime;
  }

  @JsonProperty("TransactionToDateTime")
  public void setTransactionToDateTime(@Nullable Date transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsent1Data obReadConsent1Data = (OBReadConsent1Data) o;
    return Objects.equals(this.permissions, obReadConsent1Data.permissions) &&
        Objects.equals(this.expirationDateTime, obReadConsent1Data.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsent1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsent1Data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1Data {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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


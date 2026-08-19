package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBInternalConsentStatus1Code;
import com.acme.banking.model.OBStatusReason;
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
 * OBReadConsentResponse1Data
 */

@JsonTypeName("OBReadConsentResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadConsentResponse1Data {

  private String consentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date creationDateTime;

  private OBInternalConsentStatus1Code status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OBStatusReason> statusReason = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date statusUpdateDateTime;

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

  public OBReadConsentResponse1Data() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadConsentResponse1Data(String consentId, Date creationDateTime, OBInternalConsentStatus1Code status, Date statusUpdateDateTime, List<PermissionsEnum> permissions) {
    this.consentId = consentId;
    this.creationDateTime = creationDateTime;
    this.status = status;
    this.statusUpdateDateTime = statusUpdateDateTime;
    this.permissions = permissions;
  }

  public OBReadConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the account access consent resource.
   * @return consentId
   */
  @NotNull
  @Schema(name = "ConsentId", description = "Unique identification as assigned to identify the account access consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  @JsonProperty("ConsentId")
  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBReadConsentResponse1Data creationDateTime(Date creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
   */
  @NotNull
  @Schema(name = "CreationDateTime", example = "2024-05-29T00:00Z", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreationDateTime")
  public Date getCreationDateTime() {
    return creationDateTime;
  }

  @JsonProperty("CreationDateTime")
  public void setCreationDateTime(Date creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBReadConsentResponse1Data status(OBInternalConsentStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public OBInternalConsentStatus1Code getStatus() {
    return status;
  }

  @JsonProperty("Status")
  public void setStatus(OBInternalConsentStatus1Code status) {
    this.status = status;
  }

  public OBReadConsentResponse1Data statusReason(List<OBStatusReason> statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  public OBReadConsentResponse1Data addStatusReasonItem(OBStatusReason statusReasonItem) {
    if (this.statusReason == null) {
      this.statusReason = new ArrayList<>();
    }
    this.statusReason.add(statusReasonItem);
    return this;
  }

  /**
   * Specifies the status reason.
   * @return statusReason
   */
  
  @Schema(name = "StatusReason", description = "Specifies the status reason.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusReason")
  public List<OBStatusReason> getStatusReason() {
    return statusReason;
  }

  @JsonProperty("StatusReason")
  public void setStatusReason(List<OBStatusReason> statusReason) {
    this.statusReason = statusReason;
  }

  public OBReadConsentResponse1Data statusUpdateDateTime(Date statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
   */
  @NotNull
  @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StatusUpdateDateTime")
  public Date getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  @JsonProperty("StatusUpdateDateTime")
  public void setStatusUpdateDateTime(Date statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBReadConsentResponse1Data permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsentResponse1Data addPermissionsItem(PermissionsEnum permissionsItem) {
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

  public OBReadConsentResponse1Data expirationDateTime(@Nullable Date expirationDateTime) {
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

  public OBReadConsentResponse1Data transactionFromDateTime(@Nullable Date transactionFromDateTime) {
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

  public OBReadConsentResponse1Data transactionToDateTime(@Nullable Date transactionToDateTime) {
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
    OBReadConsentResponse1Data obReadConsentResponse1Data = (OBReadConsentResponse1Data) o;
    return Objects.equals(this.consentId, obReadConsentResponse1Data.consentId) &&
        Objects.equals(this.creationDateTime, obReadConsentResponse1Data.creationDateTime) &&
        Objects.equals(this.status, obReadConsentResponse1Data.status) &&
        Objects.equals(this.statusReason, obReadConsentResponse1Data.statusReason) &&
        Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
        Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
        Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusReason, statusUpdateDateTime, permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1Data {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBAccount6AccountInner;
import com.acme.banking.model.OBBranchAndFinancialInstitutionIdentification50;
import com.acme.banking.model.OBExternalAccountSubType1Code;
import com.acme.banking.model.OBInternalAccountStatus1Code;
import com.acme.banking.model.OBInternalAccountType1Code;
import com.acme.banking.model.StatementFrequencyAndFormatInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Unambiguous identification of the account to which credit and debit entries are made. The following fields are optional only for accounts that are switched:    * Data.Currency     * Data.AccountCategory     * Data.AccountTypeCode  For all other accounts, the fields must be populated by the ASPSP.
 */

@Schema(name = "OBAccount6", description = "Unambiguous identification of the account to which credit and debit entries are made. The following fields are optional only for accounts that are switched:    * Data.Currency     * Data.AccountCategory     * Data.AccountTypeCode  For all other accounts, the fields must be populated by the ASPSP.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBAccount6 {

  private String accountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBInternalAccountStatus1Code status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date statusUpdateDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBInternalAccountType1Code accountCategory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBExternalAccountSubType1Code accountTypeCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String nickname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date openingDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date maturityDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String switchStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OBAccount6AccountInner> account = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<StatementFrequencyAndFormatInner> statementFrequencyAndFormat = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBBranchAndFinancialInstitutionIdentification50 servicer;

  public OBAccount6() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBAccount6(String accountId) {
    this.accountId = accountId;
  }

  public OBAccount6 accountId(String accountId) {
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

  public OBAccount6 status(@Nullable OBInternalAccountStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public @Nullable OBInternalAccountStatus1Code getStatus() {
    return status;
  }

  @JsonProperty("Status")
  public void setStatus(@Nullable OBInternalAccountStatus1Code status) {
    this.status = status;
  }

  public OBAccount6 statusUpdateDateTime(@Nullable Date statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
   */
  
  @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusUpdateDateTime")
  public @Nullable Date getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  @JsonProperty("StatusUpdateDateTime")
  public void setStatusUpdateDateTime(@Nullable Date statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBAccount6 currency(@Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
   */
  
  @Schema(name = "Currency", description = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Currency")
  public @Nullable String getCurrency() {
    return currency;
  }

  @JsonProperty("Currency")
  public void setCurrency(@Nullable String currency) {
    this.currency = currency;
  }

  public OBAccount6 accountCategory(@Nullable OBInternalAccountType1Code accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

  /**
   * Get accountCategory
   * @return accountCategory
   */
  
  @Schema(name = "AccountCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountCategory")
  public @Nullable OBInternalAccountType1Code getAccountCategory() {
    return accountCategory;
  }

  @JsonProperty("AccountCategory")
  public void setAccountCategory(@Nullable OBInternalAccountType1Code accountCategory) {
    this.accountCategory = accountCategory;
  }

  public OBAccount6 accountTypeCode(@Nullable OBExternalAccountSubType1Code accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

  /**
   * Get accountTypeCode
   * @return accountTypeCode
   */
  
  @Schema(name = "AccountTypeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountTypeCode")
  public @Nullable OBExternalAccountSubType1Code getAccountTypeCode() {
    return accountTypeCode;
  }

  @JsonProperty("AccountTypeCode")
  public void setAccountTypeCode(@Nullable OBExternalAccountSubType1Code accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public OBAccount6 description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the description of the account type.
   * @return description
   */
  
  @Schema(name = "Description", description = "Specifies the description of the account type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("Description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public OBAccount6 nickname(@Nullable String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
   */
  
  @Schema(name = "Nickname", description = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nickname")
  public @Nullable String getNickname() {
    return nickname;
  }

  @JsonProperty("Nickname")
  public void setNickname(@Nullable String nickname) {
    this.nickname = nickname;
  }

  public OBAccount6 openingDate(@Nullable Date openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Date on which the account and related basic services are effectively operational for the account owner. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return openingDate
   */
  
  @Schema(name = "OpeningDate", description = "Date on which the account and related basic services are effectively operational for the account owner. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpeningDate")
  public @Nullable Date getOpeningDate() {
    return openingDate;
  }

  @JsonProperty("OpeningDate")
  public void setOpeningDate(@Nullable Date openingDate) {
    this.openingDate = openingDate;
  }

  public OBAccount6 maturityDate(@Nullable Date maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Maturity date of the account. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return maturityDate
   */
  
  @Schema(name = "MaturityDate", description = "Maturity date of the account. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaturityDate")
  public @Nullable Date getMaturityDate() {
    return maturityDate;
  }

  @JsonProperty("MaturityDate")
  public void setMaturityDate(@Nullable Date maturityDate) {
    this.maturityDate = maturityDate;
  }

  public OBAccount6 switchStatus(@Nullable String switchStatus) {
    this.switchStatus = switchStatus;
    return this;
  }

  /**
   * Specifies the switch status for the account, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalSwitchStatusCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return switchStatus
   */
  
  @Schema(name = "SwitchStatus", description = "Specifies the switch status for the account, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalSwitchStatusCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SwitchStatus")
  public @Nullable String getSwitchStatus() {
    return switchStatus;
  }

  @JsonProperty("SwitchStatus")
  public void setSwitchStatus(@Nullable String switchStatus) {
    this.switchStatus = switchStatus;
  }

  public OBAccount6 account(List<OBAccount6AccountInner> account) {
    this.account = account;
    return this;
  }

  public OBAccount6 addAccountItem(OBAccount6AccountInner accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
   */
  
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Account")
  public List<OBAccount6AccountInner> getAccount() {
    return account;
  }

  @JsonProperty("Account")
  public void setAccount(List<OBAccount6AccountInner> account) {
    this.account = account;
  }

  public OBAccount6 statementFrequencyAndFormat(List<StatementFrequencyAndFormatInner> statementFrequencyAndFormat) {
    this.statementFrequencyAndFormat = statementFrequencyAndFormat;
    return this;
  }

  public OBAccount6 addStatementFrequencyAndFormatItem(StatementFrequencyAndFormatInner statementFrequencyAndFormatItem) {
    if (this.statementFrequencyAndFormat == null) {
      this.statementFrequencyAndFormat = new ArrayList<>();
    }
    this.statementFrequencyAndFormat.add(statementFrequencyAndFormatItem);
    return this;
  }

  /**
   * Get statementFrequencyAndFormat
   * @return statementFrequencyAndFormat
   */
  
  @Schema(name = "StatementFrequencyAndFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementFrequencyAndFormat")
  public List<StatementFrequencyAndFormatInner> getStatementFrequencyAndFormat() {
    return statementFrequencyAndFormat;
  }

  @JsonProperty("StatementFrequencyAndFormat")
  public void setStatementFrequencyAndFormat(List<StatementFrequencyAndFormatInner> statementFrequencyAndFormat) {
    this.statementFrequencyAndFormat = statementFrequencyAndFormat;
  }

  public OBAccount6 servicer(@Nullable OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
   */
  
  @Schema(name = "Servicer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Servicer")
  public @Nullable OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  @JsonProperty("Servicer")
  public void setServicer(@Nullable OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6 obAccount6 = (OBAccount6) o;
    return Objects.equals(this.accountId, obAccount6.accountId) &&
        Objects.equals(this.status, obAccount6.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount6.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount6.currency) &&
        Objects.equals(this.accountCategory, obAccount6.accountCategory) &&
        Objects.equals(this.accountTypeCode, obAccount6.accountTypeCode) &&
        Objects.equals(this.description, obAccount6.description) &&
        Objects.equals(this.nickname, obAccount6.nickname) &&
        Objects.equals(this.openingDate, obAccount6.openingDate) &&
        Objects.equals(this.maturityDate, obAccount6.maturityDate) &&
        Objects.equals(this.switchStatus, obAccount6.switchStatus) &&
        Objects.equals(this.account, obAccount6.account) &&
        Objects.equals(this.statementFrequencyAndFormat, obAccount6.statementFrequencyAndFormat) &&
        Objects.equals(this.servicer, obAccount6.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountCategory, accountTypeCode, description, nickname, openingDate, maturityDate, switchStatus, account, statementFrequencyAndFormat, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    statementFrequencyAndFormat: ").append(toIndentedString(statementFrequencyAndFormat)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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


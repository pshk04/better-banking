package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OtherApplicationFrequency;
import com.acme.banking.model.OtherCalculationFrequency;
import com.acme.banking.model.OtherFeeRateType;
import com.acme.banking.model.OtherFeeType;
import com.acme.banking.model.OverdraftFeeChargeCapInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details about the fees/charges
 */

@Schema(name = "OverdraftFeeChargeDetail_inner", description = "Details about the fees/charges")
@JsonTypeName("OverdraftFeeChargeDetail_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OverdraftFeeChargeDetailInner {

  /**
   * Overdraft fee type
   */
  public enum FeeTypeEnum {
    ARRANGED_OVERDRAFT("ArrangedOverdraft"),
    
    ANNUAL_REVIEW("AnnualReview"),
    
    EMERGENCY_BORROWING("EmergencyBorrowing"),
    
    BORROWING_ITEM("BorrowingItem"),
    
    OVERDRAFT_RENEWAL("OverdraftRenewal"),
    
    OVERDRAFT_SETUP("OverdraftSetup"),
    
    SURCHARGE("Surcharge"),
    
    TEMP_OVERDRAFT("TempOverdraft"),
    
    UNAUTHORISED_BORROWING("UnauthorisedBorrowing"),
    
    UNAUTHORISED_PAID_TRANS("UnauthorisedPaidTrans"),
    
    OTHER("Other"),
    
    UNAUTHORISED_UNPAID_TRANS("UnauthorisedUnpaidTrans");

    private final String value;

    FeeTypeEnum(String value) {
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
    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FeeTypeEnum feeType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean negotiableIndicator;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean overdraftControlIndicator;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String incrementalBorrowingAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String feeAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String feeRate;

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   */
  public enum FeeRateTypeEnum {
    GROSS("Gross"),
    
    OTHER("Other");

    private final String value;

    FeeRateTypeEnum(String value) {
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
    public static FeeRateTypeEnum fromValue(String value) {
      for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FeeRateTypeEnum feeRateType;

  /**
   * Frequency at which the overdraft charge is applied to the account
   */
  public enum ApplicationFrequencyEnum {
    ON_CLOSING("OnClosing"),
    
    ON_OPENING("OnOpening"),
    
    CHARGING_PERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PER_ITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ON_ANNIVERSARY("OnAnniversary"),
    
    OTHER("Other"),
    
    PER_HUNDRED_POUNDS("PerHundredPounds"),
    
    PER_HOUR("PerHour"),
    
    PER_OCCURRENCE("PerOccurrence"),
    
    PER_SHEET("PerSheet"),
    
    PER_TRANSACTION("PerTransaction"),
    
    PER_TRANSACTION_AMOUNT("PerTransactionAmount"),
    
    PER_TRANSACTION_PERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIX_MONTHLY("SixMonthly"),
    
    STATEMENT_MONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private final String value;

    ApplicationFrequencyEnum(String value) {
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
    public static ApplicationFrequencyEnum fromValue(String value) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ApplicationFrequencyEnum applicationFrequency;

  /**
   * How often is the overdraft fee/charge calculated for the account.
   */
  public enum CalculationFrequencyEnum {
    ON_CLOSING("OnClosing"),
    
    ON_OPENING("OnOpening"),
    
    CHARGING_PERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PER_ITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ON_ANNIVERSARY("OnAnniversary"),
    
    OTHER("Other"),
    
    PER_HUNDRED_POUNDS("PerHundredPounds"),
    
    PER_HOUR("PerHour"),
    
    PER_OCCURRENCE("PerOccurrence"),
    
    PER_SHEET("PerSheet"),
    
    PER_TRANSACTION("PerTransaction"),
    
    PER_TRANSACTION_AMOUNT("PerTransactionAmount"),
    
    PER_TRANSACTION_PERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIX_MONTHLY("SixMonthly"),
    
    STATEMENT_MONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private final String value;

    CalculationFrequencyEnum(String value) {
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
    public static CalculationFrequencyEnum fromValue(String value) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CalculationFrequencyEnum calculationFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OverdraftFeeChargeCapInner> overdraftFeeChargeCap = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherFeeType otherFeeType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherFeeRateType otherFeeRateType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherApplicationFrequency otherApplicationFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherCalculationFrequency otherCalculationFrequency;

  public OverdraftFeeChargeDetailInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverdraftFeeChargeDetailInner(FeeTypeEnum feeType, ApplicationFrequencyEnum applicationFrequency) {
    this.feeType = feeType;
    this.applicationFrequency = applicationFrequency;
  }

  public OverdraftFeeChargeDetailInner feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Overdraft fee type
   * @return feeType
   */
  @NotNull
  @Schema(name = "FeeType", description = "Overdraft fee type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeType")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  @JsonProperty("FeeType")
  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public OverdraftFeeChargeDetailInner negotiableIndicator(@Nullable Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Indicates whether fee and charges are negotiable
   * @return negotiableIndicator
   */
  
  @Schema(name = "NegotiableIndicator", description = "Indicates whether fee and charges are negotiable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NegotiableIndicator")
  public @Nullable Boolean getNegotiableIndicator() {
    return negotiableIndicator;
  }

  @JsonProperty("NegotiableIndicator")
  public void setNegotiableIndicator(@Nullable Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OverdraftFeeChargeDetailInner overdraftControlIndicator(@Nullable Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

  /**
   * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
   * @return overdraftControlIndicator
   */
  
  @Schema(name = "OverdraftControlIndicator", description = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftControlIndicator")
  public @Nullable Boolean getOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  @JsonProperty("OverdraftControlIndicator")
  public void setOverdraftControlIndicator(@Nullable Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public OverdraftFeeChargeDetailInner incrementalBorrowingAmount(@Nullable String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

  /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
   */
  
  @Schema(name = "IncrementalBorrowingAmount", description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IncrementalBorrowingAmount")
  public @Nullable String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  @JsonProperty("IncrementalBorrowingAmount")
  public void setIncrementalBorrowingAmount(@Nullable String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public OverdraftFeeChargeDetailInner feeAmount(@Nullable String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
   */
  
  @Schema(name = "FeeAmount", description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeAmount")
  public @Nullable String getFeeAmount() {
    return feeAmount;
  }

  @JsonProperty("FeeAmount")
  public void setFeeAmount(@Nullable String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OverdraftFeeChargeDetailInner feeRate(@Nullable String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
   */
  
  @Schema(name = "FeeRate", description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRate")
  public @Nullable String getFeeRate() {
    return feeRate;
  }

  @JsonProperty("FeeRate")
  public void setFeeRate(@Nullable String feeRate) {
    this.feeRate = feeRate;
  }

  public OverdraftFeeChargeDetailInner feeRateType(@Nullable FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
   */
  
  @Schema(name = "FeeRateType", description = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRateType")
  public @Nullable FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }

  @JsonProperty("FeeRateType")
  public void setFeeRateType(@Nullable FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OverdraftFeeChargeDetailInner applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * Frequency at which the overdraft charge is applied to the account
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", description = "Frequency at which the overdraft charge is applied to the account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  @JsonProperty("ApplicationFrequency")
  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OverdraftFeeChargeDetailInner calculationFrequency(@Nullable CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How often is the overdraft fee/charge calculated for the account.
   * @return calculationFrequency
   */
  
  @Schema(name = "CalculationFrequency", description = "How often is the overdraft fee/charge calculated for the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationFrequency")
  public @Nullable CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  @JsonProperty("CalculationFrequency")
  public void setCalculationFrequency(@Nullable CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OverdraftFeeChargeDetailInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftFeeChargeDetailInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Free text for capturing any other info related to Overdraft Fees Charge Details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  @JsonProperty("Notes")
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OverdraftFeeChargeDetailInner overdraftFeeChargeCap(List<OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftFeeChargeDetailInner addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapInner overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
   * @return overdraftFeeChargeCap
   */
  
  @Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeeChargeCap")
  public List<OverdraftFeeChargeCapInner> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  @JsonProperty("OverdraftFeeChargeCap")
  public void setOverdraftFeeChargeCap(List<OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OverdraftFeeChargeDetailInner otherFeeType(@Nullable OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
   */
  
  @Schema(name = "OtherFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeType")
  public @Nullable OtherFeeType getOtherFeeType() {
    return otherFeeType;
  }

  @JsonProperty("OtherFeeType")
  public void setOtherFeeType(@Nullable OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OverdraftFeeChargeDetailInner otherFeeRateType(@Nullable OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
   */
  
  @Schema(name = "OtherFeeRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeRateType")
  public @Nullable OtherFeeRateType getOtherFeeRateType() {
    return otherFeeRateType;
  }

  @JsonProperty("OtherFeeRateType")
  public void setOtherFeeRateType(@Nullable OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OverdraftFeeChargeDetailInner otherApplicationFrequency(@Nullable OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   */
  
  @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherApplicationFrequency")
  public @Nullable OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  @JsonProperty("OtherApplicationFrequency")
  public void setOtherApplicationFrequency(@Nullable OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OverdraftFeeChargeDetailInner otherCalculationFrequency(@Nullable OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   */
  
  @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationFrequency")
  public @Nullable OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  @JsonProperty("OtherCalculationFrequency")
  public void setOtherCalculationFrequency(@Nullable OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftFeeChargeDetailInner overdraftFeeChargeDetailInner = (OverdraftFeeChargeDetailInner) o;
    return Objects.equals(this.feeType, overdraftFeeChargeDetailInner.feeType) &&
        Objects.equals(this.negotiableIndicator, overdraftFeeChargeDetailInner.negotiableIndicator) &&
        Objects.equals(this.overdraftControlIndicator, overdraftFeeChargeDetailInner.overdraftControlIndicator) &&
        Objects.equals(this.incrementalBorrowingAmount, overdraftFeeChargeDetailInner.incrementalBorrowingAmount) &&
        Objects.equals(this.feeAmount, overdraftFeeChargeDetailInner.feeAmount) &&
        Objects.equals(this.feeRate, overdraftFeeChargeDetailInner.feeRate) &&
        Objects.equals(this.feeRateType, overdraftFeeChargeDetailInner.feeRateType) &&
        Objects.equals(this.applicationFrequency, overdraftFeeChargeDetailInner.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, overdraftFeeChargeDetailInner.calculationFrequency) &&
        Objects.equals(this.notes, overdraftFeeChargeDetailInner.notes) &&
        Objects.equals(this.overdraftFeeChargeCap, overdraftFeeChargeDetailInner.overdraftFeeChargeCap) &&
        Objects.equals(this.otherFeeType, overdraftFeeChargeDetailInner.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, overdraftFeeChargeDetailInner.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, overdraftFeeChargeDetailInner.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, overdraftFeeChargeDetailInner.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeeChargeDetailInner {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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


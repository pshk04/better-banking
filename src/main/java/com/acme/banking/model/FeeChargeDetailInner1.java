package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.FeeApplicableRange;
import com.acme.banking.model.FeeChargeCapInner1;
import com.acme.banking.model.OtherApplicationFrequency;
import com.acme.banking.model.OtherCalculationFrequency;
import com.acme.banking.model.OtherFeeCategoryType;
import com.acme.banking.model.OtherFeeRateType;
import com.acme.banking.model.OtherFeeType1;
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
 * Other fees/charges details
 */

@Schema(name = "FeeChargeDetail_inner_1", description = "Other fees/charges details")
@JsonTypeName("FeeChargeDetail_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class FeeChargeDetailInner1 {

  /**
   * Categorisation of fees and charges into standard categories.
   */
  public enum FeeCategoryEnum {
    OTHER("Other"),
    
    SERVICING("Servicing");

    private final String value;

    FeeCategoryEnum(String value) {
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
    public static FeeCategoryEnum fromValue(String value) {
      for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FeeCategoryEnum feeCategory;

  /**
   * Fee/Charge Type
   */
  public enum FeeTypeEnum {
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    
    SERVICE_C_OTHER("ServiceCOther"),
    
    OTHER("Other");

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
  private @Nullable String feeAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String feeRate;

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   */
  public enum FeeRateTypeEnum {
    LINKED_BASE_RATE("LinkedBaseRate"),
    
    GROSS("Gross"),
    
    NET("Net"),
    
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
   * How frequently the fee/charge is applied to the account
   */
  public enum ApplicationFrequencyEnum {
    ACCOUNT_CLOSING("AccountClosing"),
    
    ACCOUNT_OPENING("AccountOpening"),
    
    ACADEMIC_TERM("AcademicTerm"),
    
    CHARGING_PERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PER_ITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ON_ACCOUNT_ANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
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
   * How frequently the fee/charge is calculated
   */
  public enum CalculationFrequencyEnum {
    ACCOUNT_CLOSING("AccountClosing"),
    
    ACCOUNT_OPENING("AccountOpening"),
    
    ACADEMIC_TERM("AcademicTerm"),
    
    CHARGING_PERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PER_ITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ON_ACCOUNT_ANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
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
  private @Nullable OtherFeeCategoryType otherFeeCategoryType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherFeeType1 otherFeeType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherFeeRateType otherFeeRateType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherApplicationFrequency otherApplicationFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherCalculationFrequency otherCalculationFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<FeeChargeCapInner1> feeChargeCap = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FeeApplicableRange feeApplicableRange;

  public FeeChargeDetailInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeeChargeDetailInner1(FeeCategoryEnum feeCategory, FeeTypeEnum feeType, ApplicationFrequencyEnum applicationFrequency) {
    this.feeCategory = feeCategory;
    this.feeType = feeType;
    this.applicationFrequency = applicationFrequency;
  }

  public FeeChargeDetailInner1 feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
   */
  @NotNull
  @Schema(name = "FeeCategory", description = "Categorisation of fees and charges into standard categories.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeCategory")
  public FeeCategoryEnum getFeeCategory() {
    return feeCategory;
  }

  @JsonProperty("FeeCategory")
  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public FeeChargeDetailInner1 feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Fee/Charge Type
   * @return feeType
   */
  @NotNull
  @Schema(name = "FeeType", description = "Fee/Charge Type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeType")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  @JsonProperty("FeeType")
  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public FeeChargeDetailInner1 feeAmount(@Nullable String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
   */
  
  @Schema(name = "FeeAmount", description = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeAmount")
  public @Nullable String getFeeAmount() {
    return feeAmount;
  }

  @JsonProperty("FeeAmount")
  public void setFeeAmount(@Nullable String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public FeeChargeDetailInner1 feeRate(@Nullable String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
   */
  
  @Schema(name = "FeeRate", description = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRate")
  public @Nullable String getFeeRate() {
    return feeRate;
  }

  @JsonProperty("FeeRate")
  public void setFeeRate(@Nullable String feeRate) {
    this.feeRate = feeRate;
  }

  public FeeChargeDetailInner1 feeRateType(@Nullable FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
   */
  
  @Schema(name = "FeeRateType", description = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRateType")
  public @Nullable FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }

  @JsonProperty("FeeRateType")
  public void setFeeRateType(@Nullable FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public FeeChargeDetailInner1 applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is applied to the account
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", description = "How frequently the fee/charge is applied to the account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  @JsonProperty("ApplicationFrequency")
  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public FeeChargeDetailInner1 calculationFrequency(@Nullable CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is calculated
   * @return calculationFrequency
   */
  
  @Schema(name = "CalculationFrequency", description = "How frequently the fee/charge is calculated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationFrequency")
  public @Nullable CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  @JsonProperty("CalculationFrequency")
  public void setCalculationFrequency(@Nullable CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public FeeChargeDetailInner1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeeChargeDetailInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the fee/charge details.
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Optional additional notes to supplement the fee/charge details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  @JsonProperty("Notes")
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeeChargeDetailInner1 otherFeeCategoryType(@Nullable OtherFeeCategoryType otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

  /**
   * Get otherFeeCategoryType
   * @return otherFeeCategoryType
   */
  
  @Schema(name = "OtherFeeCategoryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeCategoryType")
  public @Nullable OtherFeeCategoryType getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  @JsonProperty("OtherFeeCategoryType")
  public void setOtherFeeCategoryType(@Nullable OtherFeeCategoryType otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public FeeChargeDetailInner1 otherFeeType(@Nullable OtherFeeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
   */
  
  @Schema(name = "OtherFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeType")
  public @Nullable OtherFeeType1 getOtherFeeType() {
    return otherFeeType;
  }

  @JsonProperty("OtherFeeType")
  public void setOtherFeeType(@Nullable OtherFeeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public FeeChargeDetailInner1 otherFeeRateType(@Nullable OtherFeeRateType otherFeeRateType) {
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

  public FeeChargeDetailInner1 otherApplicationFrequency(@Nullable OtherApplicationFrequency otherApplicationFrequency) {
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

  public FeeChargeDetailInner1 otherCalculationFrequency(@Nullable OtherCalculationFrequency otherCalculationFrequency) {
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

  public FeeChargeDetailInner1 feeChargeCap(List<FeeChargeCapInner1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public FeeChargeDetailInner1 addFeeChargeCapItem(FeeChargeCapInner1 feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
   */
  
  @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeChargeCap")
  public List<FeeChargeCapInner1> getFeeChargeCap() {
    return feeChargeCap;
  }

  @JsonProperty("FeeChargeCap")
  public void setFeeChargeCap(List<FeeChargeCapInner1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public FeeChargeDetailInner1 feeApplicableRange(@Nullable FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   * @return feeApplicableRange
   */
  
  @Schema(name = "FeeApplicableRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeApplicableRange")
  public @Nullable FeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  @JsonProperty("FeeApplicableRange")
  public void setFeeApplicableRange(@Nullable FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeChargeDetailInner1 feeChargeDetailInner1 = (FeeChargeDetailInner1) o;
    return Objects.equals(this.feeCategory, feeChargeDetailInner1.feeCategory) &&
        Objects.equals(this.feeType, feeChargeDetailInner1.feeType) &&
        Objects.equals(this.feeAmount, feeChargeDetailInner1.feeAmount) &&
        Objects.equals(this.feeRate, feeChargeDetailInner1.feeRate) &&
        Objects.equals(this.feeRateType, feeChargeDetailInner1.feeRateType) &&
        Objects.equals(this.applicationFrequency, feeChargeDetailInner1.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, feeChargeDetailInner1.calculationFrequency) &&
        Objects.equals(this.notes, feeChargeDetailInner1.notes) &&
        Objects.equals(this.otherFeeCategoryType, feeChargeDetailInner1.otherFeeCategoryType) &&
        Objects.equals(this.otherFeeType, feeChargeDetailInner1.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, feeChargeDetailInner1.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, feeChargeDetailInner1.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, feeChargeDetailInner1.otherCalculationFrequency) &&
        Objects.equals(this.feeChargeCap, feeChargeDetailInner1.feeChargeCap) &&
        Objects.equals(this.feeApplicableRange, feeChargeDetailInner1.feeApplicableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCategory, feeType, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeChargeCap, feeApplicableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeChargeDetailInner1 {\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OtherFeeTypeInner;
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
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */

@Schema(name = "FeeChargeCap_inner", description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@JsonTypeName("FeeChargeCap_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class FeeChargeCapInner {

  /**
   * Fee/charge type which is being capped
   */
  public enum FeeTypeEnum {
    OTHER("Other"),
    
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    
    SERVICE_C_ACCOUNT_FEE_QUARTERLY("ServiceCAccountFeeQuarterly"),
    
    SERVICE_C_FIXED_TARIFF("ServiceCFixedTariff"),
    
    SERVICE_C_BUSI_DEP_ACC_BREAKAGE("ServiceCBusiDepAccBreakage"),
    
    SERVICE_C_MINIMUM_MONTHLY_FEE("ServiceCMinimumMonthlyFee"),
    
    SERVICE_C_OTHER("ServiceCOther");

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

  private List<FeeTypeEnum> feeType = new ArrayList<>();

  /**
   * Min Max type
   */
  public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    
    MAXIMUM("Maximum");

    private final String value;

    MinMaxTypeEnum(String value) {
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
    public static MinMaxTypeEnum fromValue(String value) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MinMaxTypeEnum minMaxType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float feeCapOccurrence;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String feeCapAmount;

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  public enum CappingPeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private final String value;

    CappingPeriodEnum(String value) {
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
    public static CappingPeriodEnum fromValue(String value) {
      for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CappingPeriodEnum cappingPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OtherFeeTypeInner> otherFeeType = new ArrayList<>();

  public FeeChargeCapInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeeChargeCapInner(List<FeeTypeEnum> feeType, MinMaxTypeEnum minMaxType) {
    this.feeType = feeType;
    this.minMaxType = minMaxType;
  }

  public FeeChargeCapInner feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public FeeChargeCapInner addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    if (this.feeType == null) {
      this.feeType = new ArrayList<>();
    }
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Fee/charge type which is being capped
   * @return feeType
   */
  @NotNull
  @Schema(name = "FeeType", description = "Fee/charge type which is being capped", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeType")
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  @JsonProperty("FeeType")
  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public FeeChargeCapInner minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Min Max type
   * @return minMaxType
   */
  @NotNull
  @Schema(name = "MinMaxType", description = "Min Max type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MinMaxType")
  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  @JsonProperty("MinMaxType")
  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public FeeChargeCapInner feeCapOccurrence(@Nullable Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
   */
  
  @Schema(name = "FeeCapOccurrence", description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeCapOccurrence")
  public @Nullable Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  @JsonProperty("FeeCapOccurrence")
  public void setFeeCapOccurrence(@Nullable Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public FeeChargeCapInner feeCapAmount(@Nullable String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
   */
  
  @Schema(name = "FeeCapAmount", description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeCapAmount")
  public @Nullable String getFeeCapAmount() {
    return feeCapAmount;
  }

  @JsonProperty("FeeCapAmount")
  public void setFeeCapAmount(@Nullable String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public FeeChargeCapInner cappingPeriod(@Nullable CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
   */
  
  @Schema(name = "CappingPeriod", description = "Period e.g. day, week, month etc. for which the fee/charge is capped", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CappingPeriod")
  public @Nullable CappingPeriodEnum getCappingPeriod() {
    return cappingPeriod;
  }

  @JsonProperty("CappingPeriod")
  public void setCappingPeriod(@Nullable CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public FeeChargeCapInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeeChargeCapInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Free text for adding  extra details for fee charge cap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  @JsonProperty("Notes")
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeeChargeCapInner otherFeeType(List<OtherFeeTypeInner> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public FeeChargeCapInner addOtherFeeTypeItem(OtherFeeTypeInner otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
   */
  
  @Schema(name = "OtherFeeType", description = "Other fee type code which is not available in the standard code set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeType")
  public List<OtherFeeTypeInner> getOtherFeeType() {
    return otherFeeType;
  }

  @JsonProperty("OtherFeeType")
  public void setOtherFeeType(List<OtherFeeTypeInner> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeChargeCapInner feeChargeCapInner = (FeeChargeCapInner) o;
    return Objects.equals(this.feeType, feeChargeCapInner.feeType) &&
        Objects.equals(this.minMaxType, feeChargeCapInner.minMaxType) &&
        Objects.equals(this.feeCapOccurrence, feeChargeCapInner.feeCapOccurrence) &&
        Objects.equals(this.feeCapAmount, feeChargeCapInner.feeCapAmount) &&
        Objects.equals(this.cappingPeriod, feeChargeCapInner.cappingPeriod) &&
        Objects.equals(this.notes, feeChargeCapInner.notes) &&
        Objects.equals(this.otherFeeType, feeChargeCapInner.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeChargeCapInner {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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


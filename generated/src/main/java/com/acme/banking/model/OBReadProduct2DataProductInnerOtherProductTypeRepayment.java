package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner;
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
 * Repayment details of the Loan product
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment", description = "Repayment details of the Loan product")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadProduct2DataProductInnerOtherProductTypeRepayment {

  /**
   * Repayment type
   */
  public enum RepaymentTypeEnum {
    USBA("USBA"),
    
    USBU("USBU"),
    
    USCI("USCI"),
    
    USCS("USCS"),
    
    USER("USER"),
    
    USFA("USFA"),
    
    USFB("USFB"),
    
    USFI("USFI"),
    
    USIO("USIO"),
    
    USOT("USOT"),
    
    USPF("USPF"),
    
    USRW("USRW"),
    
    USSL("USSL");

    private final String value;

    RepaymentTypeEnum(String value) {
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
    public static RepaymentTypeEnum fromValue(String value) {
      for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable RepaymentTypeEnum repaymentType;

  /**
   * Repayment frequency
   */
  public enum RepaymentFrequencyEnum {
    SMDA("SMDA"),
    
    SMFL("SMFL"),
    
    SMFO("SMFO"),
    
    SMHY("SMHY"),
    
    SMMO("SMMO"),
    
    SMOT("SMOT"),
    
    SMQU("SMQU"),
    
    SMWE("SMWE"),
    
    SMYE("SMYE");

    private final String value;

    RepaymentFrequencyEnum(String value) {
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
    public static RepaymentFrequencyEnum fromValue(String value) {
      for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable RepaymentFrequencyEnum repaymentFrequency;

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   */
  public enum AmountTypeEnum {
    RABD("RABD"),
    
    RABL("RABL"),
    
    RACI("RACI"),
    
    RAFC("RAFC"),
    
    RAIO("RAIO"),
    
    RALT("RALT"),
    
    USOT("USOT");

    private final String value;

    AmountTypeEnum(String value) {
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
    public static AmountTypeEnum fromValue(String value) {
      for (AmountTypeEnum b : AmountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AmountTypeEnum amountType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType otherAmountType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> repaymentHoliday = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentType(@Nullable RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  /**
   * Repayment type
   * @return repaymentType
   */
  
  @Schema(name = "RepaymentType", description = "Repayment type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepaymentType")
  public @Nullable RepaymentTypeEnum getRepaymentType() {
    return repaymentType;
  }

  @JsonProperty("RepaymentType")
  public void setRepaymentType(@Nullable RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentFrequency(@Nullable RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

  /**
   * Repayment frequency
   * @return repaymentFrequency
   */
  
  @Schema(name = "RepaymentFrequency", description = "Repayment frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepaymentFrequency")
  public @Nullable RepaymentFrequencyEnum getRepaymentFrequency() {
    return repaymentFrequency;
  }

  @JsonProperty("RepaymentFrequency")
  public void setRepaymentFrequency(@Nullable RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment amountType(@Nullable AmountTypeEnum amountType) {
    this.amountType = amountType;
    return this;
  }

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   * @return amountType
   */
  
  @Schema(name = "AmountType", description = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AmountType")
  public @Nullable AmountTypeEnum getAmountType() {
    return amountType;
  }

  @JsonProperty("AmountType")
  public void setAmountType(@Nullable AmountTypeEnum amountType) {
    this.amountType = amountType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  
  @Schema(name = "Notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  @JsonProperty("Notes")
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment otherRepaymentType(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
    return this;
  }

  /**
   * Get otherRepaymentType
   * @return otherRepaymentType
   */
  
  @Schema(name = "OtherRepaymentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherRepaymentType")
  public @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType getOtherRepaymentType() {
    return otherRepaymentType;
  }

  @JsonProperty("OtherRepaymentType")
  public void setOtherRepaymentType(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment otherRepaymentFrequency(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
    return this;
  }

  /**
   * Get otherRepaymentFrequency
   * @return otherRepaymentFrequency
   */
  
  @Schema(name = "OtherRepaymentFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherRepaymentFrequency")
  public @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency getOtherRepaymentFrequency() {
    return otherRepaymentFrequency;
  }

  @JsonProperty("OtherRepaymentFrequency")
  public void setOtherRepaymentFrequency(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment otherAmountType(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
    return this;
  }

  /**
   * Get otherAmountType
   * @return otherAmountType
   */
  
  @Schema(name = "OtherAmountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherAmountType")
  public @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType getOtherAmountType() {
    return otherAmountType;
  }

  @JsonProperty("OtherAmountType")
  public void setOtherAmountType(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentFeeCharges(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
    return this;
  }

  /**
   * Get repaymentFeeCharges
   * @return repaymentFeeCharges
   */
  
  @Schema(name = "RepaymentFeeCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepaymentFeeCharges")
  public @Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges getRepaymentFeeCharges() {
    return repaymentFeeCharges;
  }

  @JsonProperty("RepaymentFeeCharges")
  public void setRepaymentFeeCharges(@Nullable OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment repaymentHoliday(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepayment addRepaymentHolidayItem(OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner repaymentHolidayItem) {
    if (this.repaymentHoliday == null) {
      this.repaymentHoliday = new ArrayList<>();
    }
    this.repaymentHoliday.add(repaymentHolidayItem);
    return this;
  }

  /**
   * Get repaymentHoliday
   * @return repaymentHoliday
   */
  
  @Schema(name = "RepaymentHoliday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepaymentHoliday")
  public List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> getRepaymentHoliday() {
    return repaymentHoliday;
  }

  @JsonProperty("RepaymentHoliday")
  public void setRepaymentHoliday(List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeRepayment obReadProduct2DataProductInnerOtherProductTypeRepayment = (OBReadProduct2DataProductInnerOtherProductTypeRepayment) o;
    return Objects.equals(this.repaymentType, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentType) &&
        Objects.equals(this.repaymentFrequency, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentFrequency) &&
        Objects.equals(this.amountType, obReadProduct2DataProductInnerOtherProductTypeRepayment.amountType) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeRepayment.notes) &&
        Objects.equals(this.otherRepaymentType, obReadProduct2DataProductInnerOtherProductTypeRepayment.otherRepaymentType) &&
        Objects.equals(this.otherRepaymentFrequency, obReadProduct2DataProductInnerOtherProductTypeRepayment.otherRepaymentFrequency) &&
        Objects.equals(this.otherAmountType, obReadProduct2DataProductInnerOtherProductTypeRepayment.otherAmountType) &&
        Objects.equals(this.repaymentFeeCharges, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentFeeCharges) &&
        Objects.equals(this.repaymentHoliday, obReadProduct2DataProductInnerOtherProductTypeRepayment.repaymentHoliday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentType, repaymentFrequency, amountType, notes, otherRepaymentType, otherRepaymentFrequency, otherAmountType, repaymentFeeCharges, repaymentHoliday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepayment {\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherRepaymentType: ").append(toIndentedString(otherRepaymentType)).append("\n");
    sb.append("    otherRepaymentFrequency: ").append(toIndentedString(otherRepaymentFrequency)).append("\n");
    sb.append("    otherAmountType: ").append(toIndentedString(otherAmountType)).append("\n");
    sb.append("    repaymentFeeCharges: ").append(toIndentedString(repaymentFeeCharges)).append("\n");
    sb.append("    repaymentHoliday: ").append(toIndentedString(repaymentHoliday)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBOtherCodeType10;
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
 * OBReadProduct2DataProductInnerOtherProductTypeProductDetails
 */

@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_ProductDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadProduct2DataProductInnerOtherProductTypeProductDetails {

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd 
   */
  public enum SegmentEnum {
    GEAS("GEAS"),
    
    GEBA("GEBA"),
    
    GEBR("GEBR"),
    
    GEBU("GEBU"),
    
    GECI("GECI"),
    
    GECS("GECS"),
    
    GEFB("GEFB"),
    
    GEFG("GEFG"),
    
    GEG("GEG"),
    
    GEGR("GEGR"),
    
    GEGS("GEGS"),
    
    GEOT("GEOT"),
    
    GEOV("GEOV"),
    
    GEPA("GEPA"),
    
    GEPR("GEPR"),
    
    GERE("GERE"),
    
    GEST("GEST"),
    
    GEYA("GEYA"),
    
    GEYO("GEYO"),
    
    PSCA("PSCA"),
    
    PSES("PSES"),
    
    PSNC("PSNC"),
    
    PSNP("PSNP"),
    
    PSRG("PSRG"),
    
    PSSS("PSSS"),
    
    PSST("PSST"),
    
    PSSW("PSSW");

    private final String value;

    SegmentEnum(String value) {
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
    public static SegmentEnum fromValue(String value) {
      for (SegmentEnum b : SegmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<SegmentEnum> segment = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer feeFreeLength;

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   */
  public enum FeeFreeLengthPeriodEnum {
    PACT("PACT"),
    
    PDAY("PDAY"),
    
    PHYR("PHYR"),
    
    PMTH("PMTH"),
    
    PQTR("PQTR"),
    
    PWEK("PWEK"),
    
    PYER("PYER");

    private final String value;

    FeeFreeLengthPeriodEnum(String value) {
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
    public static FeeFreeLengthPeriodEnum fromValue(String value) {
      for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FeeFreeLengthPeriodEnum feeFreeLengthPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String monthlyMaximumCharge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBOtherCodeType10 otherSegment;

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails addSegmentItem(SegmentEnum segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<>();
    }
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Get segment
   * @return segment
   */
  
  @Schema(name = "Segment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  @JsonProperty("Segment")
  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails feeFreeLength(@Nullable Integer feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
    return this;
  }

  /**
   * The length/duration of the fee free period
   * @return feeFreeLength
   */
  
  @Schema(name = "FeeFreeLength", description = "The length/duration of the fee free period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeFreeLength")
  public @Nullable Integer getFeeFreeLength() {
    return feeFreeLength;
  }

  @JsonProperty("FeeFreeLength")
  public void setFeeFreeLength(@Nullable Integer feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails feeFreeLengthPeriod(@Nullable FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return feeFreeLengthPeriod
   */
  
  @Schema(name = "FeeFreeLengthPeriod", description = "The unit of period (days, weeks, months etc.) of the promotional length", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeFreeLengthPeriod")
  public @Nullable FeeFreeLengthPeriodEnum getFeeFreeLengthPeriod() {
    return feeFreeLengthPeriod;
  }

  @JsonProperty("FeeFreeLengthPeriod")
  public void setFeeFreeLengthPeriod(@Nullable FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails monthlyMaximumCharge(@Nullable String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
    return this;
  }

  /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
   */
  
  @Schema(name = "MonthlyMaximumCharge", description = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MonthlyMaximumCharge")
  public @Nullable String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }

  @JsonProperty("MonthlyMaximumCharge")
  public void setMonthlyMaximumCharge(@Nullable String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails otherSegment(@Nullable OBOtherCodeType10 otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  /**
   * Get otherSegment
   * @return otherSegment
   */
  
  @Schema(name = "OtherSegment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherSegment")
  public @Nullable OBOtherCodeType10 getOtherSegment() {
    return otherSegment;
  }

  @JsonProperty("OtherSegment")
  public void setOtherSegment(@Nullable OBOtherCodeType10 otherSegment) {
    this.otherSegment = otherSegment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeProductDetails obReadProduct2DataProductInnerOtherProductTypeProductDetails = (OBReadProduct2DataProductInnerOtherProductTypeProductDetails) o;
    return Objects.equals(this.segment, obReadProduct2DataProductInnerOtherProductTypeProductDetails.segment) &&
        Objects.equals(this.feeFreeLength, obReadProduct2DataProductInnerOtherProductTypeProductDetails.feeFreeLength) &&
        Objects.equals(this.feeFreeLengthPeriod, obReadProduct2DataProductInnerOtherProductTypeProductDetails.feeFreeLengthPeriod) &&
        Objects.equals(this.monthlyMaximumCharge, obReadProduct2DataProductInnerOtherProductTypeProductDetails.monthlyMaximumCharge) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeProductDetails.notes) &&
        Objects.equals(this.otherSegment, obReadProduct2DataProductInnerOtherProductTypeProductDetails.otherSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, monthlyMaximumCharge, notes, otherSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeProductDetails {\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
    sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
    sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
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


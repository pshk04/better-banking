package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.FeeChargeCapInner;
import com.acme.banking.model.FeeChargeDetailInner;
import com.acme.banking.model.OtherTariffType;
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */

@Schema(name = "OtherFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@JsonTypeName("OtherFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OtherFeesChargesInner {

  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    ELECTRONIC("Electronic"),
    
    MIXED("Mixed"),
    
    OTHER("Other");

    private final String value;

    TariffTypeEnum(String value) {
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
    public static TariffTypeEnum fromValue(String value) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TariffTypeEnum tariffType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String tariffName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherTariffType otherTariffType;

  private List<FeeChargeDetailInner> feeChargeDetail = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<FeeChargeCapInner> feeChargeCap = new ArrayList<>();

  public OtherFeesChargesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OtherFeesChargesInner(List<FeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesChargesInner tariffType(@Nullable TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }

  /**
   * TariffType which defines the fee and charges.
   * @return tariffType
   */
  
  @Schema(name = "TariffType", description = "TariffType which defines the fee and charges.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TariffType")
  public @Nullable TariffTypeEnum getTariffType() {
    return tariffType;
  }

  @JsonProperty("TariffType")
  public void setTariffType(@Nullable TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }

  public OtherFeesChargesInner tariffName(@Nullable String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Name of the tariff
   * @return tariffName
   */
  
  @Schema(name = "TariffName", description = "Name of the tariff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TariffName")
  public @Nullable String getTariffName() {
    return tariffName;
  }

  @JsonProperty("TariffName")
  public void setTariffName(@Nullable String tariffName) {
    this.tariffName = tariffName;
  }

  public OtherFeesChargesInner otherTariffType(@Nullable OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
   */
  
  @Schema(name = "OtherTariffType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherTariffType")
  public @Nullable OtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  @JsonProperty("OtherTariffType")
  public void setOtherTariffType(@Nullable OtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OtherFeesChargesInner feeChargeDetail(List<FeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesChargesInner addFeeChargeDetailItem(FeeChargeDetailInner feeChargeDetailItem) {
    if (this.feeChargeDetail == null) {
      this.feeChargeDetail = new ArrayList<>();
    }
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return feeChargeDetail
   */
  @NotNull
  @Schema(name = "FeeChargeDetail", description = "Other fees/charges details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeChargeDetail")
  public List<FeeChargeDetailInner> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  @JsonProperty("FeeChargeDetail")
  public void setFeeChargeDetail(List<FeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesChargesInner feeChargeCap(List<FeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesChargesInner addFeeChargeCapItem(FeeChargeCapInner feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
   * @return feeChargeCap
   */
  
  @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeChargeCap")
  public List<FeeChargeCapInner> getFeeChargeCap() {
    return feeChargeCap;
  }

  @JsonProperty("FeeChargeCap")
  public void setFeeChargeCap(List<FeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesChargesInner otherFeesChargesInner = (OtherFeesChargesInner) o;
    return Objects.equals(this.tariffType, otherFeesChargesInner.tariffType) &&
        Objects.equals(this.tariffName, otherFeesChargesInner.tariffName) &&
        Objects.equals(this.otherTariffType, otherFeesChargesInner.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, otherFeesChargesInner.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, otherFeesChargesInner.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesChargesInner {\n");
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBInterestCalculationMethod1Code;
import com.acme.banking.model.OBOtherCodeType10;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner;
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
 * The group of tiers or bands for which credit interest can be applied.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner", description = "The group of tiers or bands for which credit interest can be applied.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner {

  /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
   */
  public enum TierBandMethodEnum {
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

    private final String value;

    TierBandMethodEnum(String value) {
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
    public static TierBandMethodEnum fromValue(String value) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TierBandMethodEnum tierBandMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBInterestCalculationMethod1Code calculationMethod;

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   */
  public enum DestinationEnum {
    INOT("INOT"),
    
    INPA("INPA"),
    
    INSC("INSC");

    private final String value;

    DestinationEnum(String value) {
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
    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DestinationEnum destination;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBOtherCodeType10 otherCalculationMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBOtherCodeType10 otherDestination;

  private List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner(TierBandMethodEnum tierBandMethod, DestinationEnum destination, List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
    this.tierBandMethod = tierBandMethod;
    this.destination = destination;
    this.tierBand = tierBand;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
   * @return tierBandMethod
   */
  @NotNull
  @Schema(name = "TierBandMethod", description = "The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandMethod")
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  @JsonProperty("TierBandMethod")
  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner calculationMethod(@Nullable OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Get calculationMethod
   * @return calculationMethod
   */
  
  @Schema(name = "CalculationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationMethod")
  public @Nullable OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  @JsonProperty("CalculationMethod")
  public void setCalculationMethod(@Nullable OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * @return destination
   */
  @NotNull
  @Schema(name = "Destination", description = "Describes whether accrued interest is payable only to the BCA or to another bank account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Destination")
  public DestinationEnum getDestination() {
    return destination;
  }

  @JsonProperty("Destination")
  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner otherCalculationMethod(@Nullable OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
    return this;
  }

  /**
   * Get otherCalculationMethod
   * @return otherCalculationMethod
   */
  
  @Schema(name = "OtherCalculationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationMethod")
  public @Nullable OBOtherCodeType10 getOtherCalculationMethod() {
    return otherCalculationMethod;
  }

  @JsonProperty("OtherCalculationMethod")
  public void setOtherCalculationMethod(@Nullable OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner otherDestination(@Nullable OBOtherCodeType10 otherDestination) {
    this.otherDestination = otherDestination;
    return this;
  }

  /**
   * Get otherDestination
   * @return otherDestination
   */
  
  @Schema(name = "OtherDestination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherDestination")
  public @Nullable OBOtherCodeType10 getOtherDestination() {
    return otherDestination;
  }

  @JsonProperty("OtherDestination")
  public void setOtherDestination(@Nullable OBOtherCodeType10 otherDestination) {
    this.otherDestination = otherDestination;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBand(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner addTierBandItem(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierBandItem) {
    if (this.tierBand == null) {
      this.tierBand = new ArrayList<>();
    }
    this.tierBand.add(tierBandItem);
    return this;
  }

  /**
   * Get tierBand
   * @return tierBand
   */
  @NotNull
  @Schema(name = "TierBand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBand")
  public List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> getTierBand() {
    return tierBand;
  }

  @JsonProperty("TierBand")
  public void setTierBand(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner> tierBand) {
    this.tierBand = tierBand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner) o;
    return Objects.equals(this.tierBandMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.tierBandMethod) &&
        Objects.equals(this.calculationMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.calculationMethod) &&
        Objects.equals(this.destination, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.destination) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.notes) &&
        Objects.equals(this.otherCalculationMethod, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.otherCalculationMethod) &&
        Objects.equals(this.otherDestination, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.otherDestination) &&
        Objects.equals(this.tierBand, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.tierBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, calculationMethod, destination, notes, otherCalculationMethod, otherDestination, tierBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner {\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
    sb.append("    otherDestination: ").append(toIndentedString(otherDestination)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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


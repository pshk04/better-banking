package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.TierBandInner1;
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

@Schema(name = "TierBandSet_inner_1", description = "The group of tiers or bands for which credit interest can be applied.")
@JsonTypeName("TierBandSet_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class TierBandSetInner1 {

  /**
   * The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance
   */
  public enum TierBandMethodEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole");

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

  /**
   * Methods of calculating interest
   */
  public enum CalculationMethodEnum {
    COMPOUND("Compound"),
    
    SIMPLE_INTEREST("SimpleInterest");

    private final String value;

    CalculationMethodEnum(String value) {
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
    public static CalculationMethodEnum fromValue(String value) {
      for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CalculationMethodEnum calculationMethod;

  /**
   * Describes whether accrued interest is payable only to the PCA or to another bank account
   */
  public enum DestinationEnum {
    PAY_AWAY("PayAway"),
    
    SELF_CREDIT("SelfCredit");

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

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable DestinationEnum destination;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  private List<TierBandInner1> tierBand = new ArrayList<>();

  public TierBandSetInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TierBandSetInner1(TierBandMethodEnum tierBandMethod, List<TierBandInner1> tierBand) {
    this.tierBandMethod = tierBandMethod;
    this.tierBand = tierBand;
  }

  public TierBandSetInner1 tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance
   * @return tierBandMethod
   */
  @NotNull
  @Schema(name = "TierBandMethod", description = "The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandMethod")
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  @JsonProperty("TierBandMethod")
  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public TierBandSetInner1 calculationMethod(@Nullable CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Methods of calculating interest
   * @return calculationMethod
   */
  
  @Schema(name = "CalculationMethod", description = "Methods of calculating interest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationMethod")
  public @Nullable CalculationMethodEnum getCalculationMethod() {
    return calculationMethod;
  }

  @JsonProperty("CalculationMethod")
  public void setCalculationMethod(@Nullable CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public TierBandSetInner1 destination(@Nullable DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the PCA or to another bank account
   * @return destination
   */
  
  @Schema(name = "Destination", description = "Describes whether accrued interest is payable only to the PCA or to another bank account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Destination")
  public @Nullable DestinationEnum getDestination() {
    return destination;
  }

  @JsonProperty("Destination")
  public void setDestination(@Nullable DestinationEnum destination) {
    this.destination = destination;
  }

  public TierBandSetInner1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public TierBandSetInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier Band Set details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  @JsonProperty("Notes")
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public TierBandSetInner1 tierBand(List<TierBandInner1> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public TierBandSetInner1 addTierBandItem(TierBandInner1 tierBandItem) {
    if (this.tierBand == null) {
      this.tierBand = new ArrayList<>();
    }
    this.tierBand.add(tierBandItem);
    return this;
  }

  /**
   * Tier Band Details
   * @return tierBand
   */
  @NotNull
  @Schema(name = "TierBand", description = "Tier Band Details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBand")
  public List<TierBandInner1> getTierBand() {
    return tierBand;
  }

  @JsonProperty("TierBand")
  public void setTierBand(List<TierBandInner1> tierBand) {
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
    TierBandSetInner1 tierBandSetInner1 = (TierBandSetInner1) o;
    return Objects.equals(this.tierBandMethod, tierBandSetInner1.tierBandMethod) &&
        Objects.equals(this.calculationMethod, tierBandSetInner1.calculationMethod) &&
        Objects.equals(this.destination, tierBandSetInner1.destination) &&
        Objects.equals(this.notes, tierBandSetInner1.notes) &&
        Objects.equals(this.tierBand, tierBandSetInner1.tierBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, calculationMethod, destination, notes, tierBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierBandSetInner1 {\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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


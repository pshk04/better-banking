package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.TierBandSetInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Details about the interest that may be payable to the BCA account holders
 */

@Schema(name = "CreditInterest", description = "Details about the interest that may be payable to the BCA account holders")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class CreditInterest {

  private List<TierBandSetInner> tierBandSet = new ArrayList<>();

  public CreditInterest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreditInterest(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  public CreditInterest tierBandSet(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest addTierBandSetItem(TierBandSetInner tierBandSetItem) {
    if (this.tierBandSet == null) {
      this.tierBandSet = new ArrayList<>();
    }
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
   */
  @NotNull
  @Schema(name = "TierBandSet", description = "The group of tiers or bands for which credit interest can be applied.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandSet")
  public List<TierBandSetInner> getTierBandSet() {
    return tierBandSet;
  }

  @JsonProperty("TierBandSet")
  public void setTierBandSet(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest creditInterest = (CreditInterest) o;
    return Objects.equals(this.tierBandSet, creditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest {\n");
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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


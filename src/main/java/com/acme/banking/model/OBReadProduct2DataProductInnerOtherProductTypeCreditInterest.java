package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Details about the interest that may be payable to the Account holders
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest", description = "Details about the interest that may be payable to the Account holders")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterest {

  private List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest tierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest addTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner tierBandSetItem) {
    if (this.tierBandSet == null) {
      this.tierBandSet = new ArrayList<>();
    }
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * Get tierBandSet
   * @return tierBandSet
   */
  @NotNull
  @Schema(name = "TierBandSet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandSet")
  public List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> getTierBandSet() {
    return tierBandSet;
  }

  @JsonProperty("TierBandSet")
  public void setTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner> tierBandSet) {
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
    OBReadProduct2DataProductInnerOtherProductTypeCreditInterest obReadProduct2DataProductInnerOtherProductTypeCreditInterest = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterest) o;
    return Objects.equals(this.tierBandSet, obReadProduct2DataProductInnerOtherProductTypeCreditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterest {\n");
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


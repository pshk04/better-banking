package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.CreditInterest1;
import com.acme.banking.model.OtherFeesCharges;
import com.acme.banking.model.Overdraft1;
import com.acme.banking.model.ProductDetails1;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBPCAData1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBPCAData1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProductDetails1 productDetails;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreditInterest1 creditInterest;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Overdraft1 overdraft;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherFeesCharges otherFeesCharges;

  public OBPCAData1 productDetails(@Nullable ProductDetails1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
   */
  
  @Schema(name = "ProductDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductDetails")
  public @Nullable ProductDetails1 getProductDetails() {
    return productDetails;
  }

  @JsonProperty("ProductDetails")
  public void setProductDetails(@Nullable ProductDetails1 productDetails) {
    this.productDetails = productDetails;
  }

  public OBPCAData1 creditInterest(@Nullable CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
   */
  
  @Schema(name = "CreditInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditInterest")
  public @Nullable CreditInterest1 getCreditInterest() {
    return creditInterest;
  }

  @JsonProperty("CreditInterest")
  public void setCreditInterest(@Nullable CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBPCAData1 overdraft(@Nullable Overdraft1 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
   */
  
  @Schema(name = "Overdraft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Overdraft")
  public @Nullable Overdraft1 getOverdraft() {
    return overdraft;
  }

  @JsonProperty("Overdraft")
  public void setOverdraft(@Nullable Overdraft1 overdraft) {
    this.overdraft = overdraft;
  }

  public OBPCAData1 otherFeesCharges(@Nullable OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
   */
  
  @Schema(name = "OtherFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeesCharges")
  public @Nullable OtherFeesCharges getOtherFeesCharges() {
    return otherFeesCharges;
  }

  @JsonProperty("OtherFeesCharges")
  public void setOtherFeesCharges(@Nullable OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPCAData1 obPCAData1 = (OBPCAData1) o;
    return Objects.equals(this.productDetails, obPCAData1.productDetails) &&
        Objects.equals(this.creditInterest, obPCAData1.creditInterest) &&
        Objects.equals(this.overdraft, obPCAData1.overdraft) &&
        Objects.equals(this.otherFeesCharges, obPCAData1.otherFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPCAData1 {\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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


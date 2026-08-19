package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
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
 * Details of the merchant involved in the transaction.
 */

@Schema(name = "OBMerchantDetails1", description = "Details of the merchant involved in the transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBMerchantDetails1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String merchantName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String merchantCategoryCode;

  public OBMerchantDetails1 merchantName(@Nullable String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Name by which the merchant is known.
   * @return merchantName
   */
  
  @Schema(name = "MerchantName", description = "Name by which the merchant is known.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MerchantName")
  public @Nullable String getMerchantName() {
    return merchantName;
  }

  @JsonProperty("MerchantName")
  public void setMerchantName(@Nullable String merchantName) {
    this.merchantName = merchantName;
  }

  public OBMerchantDetails1 merchantCategoryCode(@Nullable String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   * @return merchantCategoryCode
   */
  
  @Schema(name = "MerchantCategoryCode", description = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MerchantCategoryCode")
  public @Nullable String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  @JsonProperty("MerchantCategoryCode")
  public void setMerchantCategoryCode(@Nullable String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMerchantDetails1 obMerchantDetails1 = (OBMerchantDetails1) o;
    return Objects.equals(this.merchantName, obMerchantDetails1.merchantName) &&
        Objects.equals(this.merchantCategoryCode, obMerchantDetails1.merchantCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCategoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBMerchantDetails1 {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
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


package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBBCAData1;
import com.acme.banking.model.OBPCAData1;
import com.acme.banking.model.OBReadProduct2DataProductInnerOtherProductType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Product details associated with the Account
 */

@Schema(name = "OBReadProduct2_Data_Product_inner", description = "Product details associated with the Account")
@JsonTypeName("OBReadProduct2_Data_Product_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadProduct2DataProductInner {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String productName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String productId;

  private String accountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String secondaryProductId;

  /**
   * Descriptive code for the product category.  For a full list refer to `OBInternalProductType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /><br /> If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.
   */
  public enum ProductTypeEnum {
    BUSINESS_CURRENT_ACCOUNT("BusinessCurrentAccount"),
    
    COMMERCIAL_CREDIT_CARD("CommercialCreditCard"),
    
    OTHER("Other"),
    
    PERSONAL_CURRENT_ACCOUNT("PersonalCurrentAccount"),
    
    SME_LOAN("SMELoan");

    private final String value;

    ProductTypeEnum(String value) {
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
    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProductTypeEnum productType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String marketingStateId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBReadProduct2DataProductInnerOtherProductType otherProductType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBBCAData1 BCA;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBPCAData1 PCA;

  public OBReadProduct2DataProductInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInner(String accountId, ProductTypeEnum productType) {
    this.accountId = accountId;
    this.productType = productType;
  }

  public OBReadProduct2DataProductInner productName(@Nullable String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
   */
  
  @Schema(name = "ProductName", example = "321 Product", description = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductName")
  public @Nullable String getProductName() {
    return productName;
  }

  @JsonProperty("ProductName")
  public void setProductName(@Nullable String productName) {
    this.productName = productName;
  }

  public OBReadProduct2DataProductInner productId(@Nullable String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation
   * @return productId
   */
  
  @Schema(name = "ProductId", example = "51B", description = "Identifier within the parent organisation for the product. Must be unique in the organisation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductId")
  public @Nullable String getProductId() {
    return productId;
  }

  @JsonProperty("ProductId")
  public void setProductId(@Nullable String productId) {
    this.productId = productId;
  }

  public OBReadProduct2DataProductInner accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
   */
  @NotNull
  @Schema(name = "AccountId", example = "22289", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty("AccountId")
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadProduct2DataProductInner secondaryProductId(@Nullable String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
    return this;
  }

  /**
   * Any secondary Identification which supports Product Identifier to uniquely identify the current account banking products.
   * @return secondaryProductId
   */
  
  @Schema(name = "SecondaryProductId", example = "CA78", description = "Any secondary Identification which supports Product Identifier to uniquely identify the current account banking products.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecondaryProductId")
  public @Nullable String getSecondaryProductId() {
    return secondaryProductId;
  }

  @JsonProperty("SecondaryProductId")
  public void setSecondaryProductId(@Nullable String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
  }

  public OBReadProduct2DataProductInner productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Descriptive code for the product category.  For a full list refer to `OBInternalProductType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /><br /> If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.
   * @return productType
   */
  @NotNull
  @Schema(name = "ProductType", example = "PersonalCurrentAccount", description = "Descriptive code for the product category.  For a full list refer to `OBInternalProductType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /><br /> If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ProductType")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  @JsonProperty("ProductType")
  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public OBReadProduct2DataProductInner marketingStateId(@Nullable String marketingStateId) {
    this.marketingStateId = marketingStateId;
    return this;
  }

  /**
   * Unique and unambiguous identification of a Product Marketing State.
   * @return marketingStateId
   */
  
  @Schema(name = "MarketingStateId", example = "22878123", description = "Unique and unambiguous identification of a Product Marketing State.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MarketingStateId")
  public @Nullable String getMarketingStateId() {
    return marketingStateId;
  }

  @JsonProperty("MarketingStateId")
  public void setMarketingStateId(@Nullable String marketingStateId) {
    this.marketingStateId = marketingStateId;
  }

  public OBReadProduct2DataProductInner otherProductType(@Nullable OBReadProduct2DataProductInnerOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
    return this;
  }

  /**
   * Get otherProductType
   * @return otherProductType
   */
  
  @Schema(name = "OtherProductType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherProductType")
  public @Nullable OBReadProduct2DataProductInnerOtherProductType getOtherProductType() {
    return otherProductType;
  }

  @JsonProperty("OtherProductType")
  public void setOtherProductType(@Nullable OBReadProduct2DataProductInnerOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
  }

  public OBReadProduct2DataProductInner BCA(@Nullable OBBCAData1 BCA) {
    this.BCA = BCA;
    return this;
  }

  /**
   * Get BCA
   * @return BCA
   */
  
  @Schema(name = "BCA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BCA")
  public @Nullable OBBCAData1 getBCA() {
    return BCA;
  }

  @JsonProperty("BCA")
  public void setBCA(@Nullable OBBCAData1 BCA) {
    this.BCA = BCA;
  }

  public OBReadProduct2DataProductInner PCA(@Nullable OBPCAData1 PCA) {
    this.PCA = PCA;
    return this;
  }

  /**
   * Get PCA
   * @return PCA
   */
  
  @Schema(name = "PCA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PCA")
  public @Nullable OBPCAData1 getPCA() {
    return PCA;
  }

  @JsonProperty("PCA")
  public void setPCA(@Nullable OBPCAData1 PCA) {
    this.PCA = PCA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInner obReadProduct2DataProductInner = (OBReadProduct2DataProductInner) o;
    return Objects.equals(this.productName, obReadProduct2DataProductInner.productName) &&
        Objects.equals(this.productId, obReadProduct2DataProductInner.productId) &&
        Objects.equals(this.accountId, obReadProduct2DataProductInner.accountId) &&
        Objects.equals(this.secondaryProductId, obReadProduct2DataProductInner.secondaryProductId) &&
        Objects.equals(this.productType, obReadProduct2DataProductInner.productType) &&
        Objects.equals(this.marketingStateId, obReadProduct2DataProductInner.marketingStateId) &&
        Objects.equals(this.otherProductType, obReadProduct2DataProductInner.otherProductType) &&
        Objects.equals(this.BCA, obReadProduct2DataProductInner.BCA) &&
        Objects.equals(this.PCA, obReadProduct2DataProductInner.PCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId, otherProductType, BCA, PCA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInner {\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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


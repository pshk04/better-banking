package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Other repayment type which is not in the standard code list
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_OtherRepaymentType", description = "Other repayment type which is not in the standard code list")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Repayment_OtherRepaymentType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String code;

  private String name;

  private String description;

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
   */
  
  @Schema(name = "Code", description = "The four letter Mnemonic used within an XML file to identify a code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public @Nullable String getCode() {
    return code;
  }

  @JsonProperty("Code")
  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
   */
  @NotNull
  @Schema(name = "Name", description = "Long name associated with the code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  @JsonProperty("Name")
  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
   */
  @NotNull
  @Schema(name = "Description", description = "Description to describe the purpose of the code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("Description")
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType = (OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType) o;
    return Objects.equals(this.code, obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType.code) &&
        Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType.name) &&
        Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


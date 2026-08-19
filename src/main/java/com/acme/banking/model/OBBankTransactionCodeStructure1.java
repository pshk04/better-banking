package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
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
 * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 */

@Schema(name = "OBBankTransactionCodeStructure1", description = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBBankTransactionCodeStructure1 {

  private String code;

  private String subCode;

  public OBBankTransactionCodeStructure1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBBankTransactionCodeStructure1(String code, String subCode) {
    this.code = code;
    this.subCode = subCode;
  }

  public OBBankTransactionCodeStructure1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Specifies the family within a domain.
   * @return code
   */
  @NotNull
  @Schema(name = "Code", description = "Specifies the family within a domain.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  @JsonProperty("Code")
  public void setCode(String code) {
    this.code = code;
  }

  public OBBankTransactionCodeStructure1 subCode(String subCode) {
    this.subCode = subCode;
    return this;
  }

  /**
   * Specifies the sub-product family within a specific family.
   * @return subCode
   */
  @NotNull
  @Schema(name = "SubCode", description = "Specifies the sub-product family within a specific family.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SubCode")
  public String getSubCode() {
    return subCode;
  }

  @JsonProperty("SubCode")
  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBankTransactionCodeStructure1 obBankTransactionCodeStructure1 = (OBBankTransactionCodeStructure1) o;
    return Objects.equals(this.code, obBankTransactionCodeStructure1.code) &&
        Objects.equals(this.subCode, obBankTransactionCodeStructure1.subCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, subCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBankTransactionCodeStructure1 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
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


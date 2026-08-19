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
 * Additional proprietary bank transaction codes used by the ASPSP for the underlying transaction
 */

@Schema(name = "OBExtendedProprietaryBankTransactionCode", description = "Additional proprietary bank transaction codes used by the ASPSP for the underlying transaction")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBExtendedProprietaryBankTransactionCode {

  private String code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String issuer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  public OBExtendedProprietaryBankTransactionCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBExtendedProprietaryBankTransactionCode(String code) {
    this.code = code;
  }

  public OBExtendedProprietaryBankTransactionCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Proprietary bank transaction code to identify the underlying transaction.
   * @return code
   */
  @NotNull
  @Schema(name = "Code", description = "Proprietary bank transaction code to identify the underlying transaction.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  @JsonProperty("Code")
  public void setCode(String code) {
    this.code = code;
  }

  public OBExtendedProprietaryBankTransactionCode issuer(@Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Identification of the issuer of the proprietary bank transaction code.
   * @return issuer
   */
  
  @Schema(name = "Issuer", description = "Identification of the issuer of the proprietary bank transaction code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Issuer")
  public @Nullable String getIssuer() {
    return issuer;
  }

  @JsonProperty("Issuer")
  public void setIssuer(@Nullable String issuer) {
    this.issuer = issuer;
  }

  public OBExtendedProprietaryBankTransactionCode description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the code and its usage on the ASPSP channel
   * @return description
   */
  
  @Schema(name = "Description", description = "Description of the code and its usage on the ASPSP channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("Description")
  public void setDescription(@Nullable String description) {
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
    OBExtendedProprietaryBankTransactionCode obExtendedProprietaryBankTransactionCode = (OBExtendedProprietaryBankTransactionCode) o;
    return Objects.equals(this.code, obExtendedProprietaryBankTransactionCode.code) &&
        Objects.equals(this.issuer, obExtendedProprietaryBankTransactionCode.issuer) &&
        Objects.equals(this.description, obExtendedProprietaryBankTransactionCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBExtendedProprietaryBankTransactionCode {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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


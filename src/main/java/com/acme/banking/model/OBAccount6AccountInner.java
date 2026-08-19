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
 * Provides the details to identify an account.
 */

@Schema(name = "OBAccount6_Account_inner", description = "Provides the details to identify an account.")
@JsonTypeName("OBAccount6_Account_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBAccount6AccountInner {

  private String schemeName;

  private String identification;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String LEI;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String secondaryIdentification;

  public OBAccount6AccountInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBAccount6AccountInner(String schemeName, String identification) {
    this.schemeName = schemeName;
    this.identification = identification;
  }

  public OBAccount6AccountInner schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
   */
  @NotNull
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  @JsonProperty("SchemeName")
  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBAccount6AccountInner identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   * @return identification
   */
  @NotNull
  @Schema(name = "Identification", example = "80200112344562", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  @JsonProperty("Identification")
  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBAccount6AccountInner name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.
   * @return name
   */
  
  @Schema(name = "Name", example = "Jane Smith", description = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("Name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OBAccount6AccountInner LEI(@Nullable String LEI) {
    this.LEI = LEI;
    return this;
  }

  /**
   * Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
   * @return LEI
   */
  
  @Schema(name = "LEI", example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LEI")
  public @Nullable String getLEI() {
    return LEI;
  }

  @JsonProperty("LEI")
  public void setLEI(@Nullable String LEI) {
    this.LEI = LEI;
  }

  public OBAccount6AccountInner secondaryIdentification(@Nullable String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
   * @return secondaryIdentification
   */
  
  @Schema(name = "SecondaryIdentification", example = "87562298675897", description = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecondaryIdentification")
  public @Nullable String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  @JsonProperty("SecondaryIdentification")
  public void setSecondaryIdentification(@Nullable String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6AccountInner obAccount6AccountInner = (OBAccount6AccountInner) o;
    return Objects.equals(this.schemeName, obAccount6AccountInner.schemeName) &&
        Objects.equals(this.identification, obAccount6AccountInner.identification) &&
        Objects.equals(this.name, obAccount6AccountInner.name) &&
        Objects.equals(this.LEI, obAccount6AccountInner.LEI) &&
        Objects.equals(this.secondaryIdentification, obAccount6AccountInner.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, LEI, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6AccountInner {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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


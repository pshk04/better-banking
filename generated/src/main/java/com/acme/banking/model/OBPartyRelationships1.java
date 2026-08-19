package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBPartyRelationships1Account;
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
 * The Party&#39;s relationships with other resources.
 */

@Schema(name = "OBPartyRelationships1", description = "The Party's relationships with other resources.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBPartyRelationships1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBPartyRelationships1Account account;

  public OBPartyRelationships1 account(@Nullable OBPartyRelationships1Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Account")
  public @Nullable OBPartyRelationships1Account getAccount() {
    return account;
  }

  @JsonProperty("Account")
  public void setAccount(@Nullable OBPartyRelationships1Account account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1 obPartyRelationships1 = (OBPartyRelationships1) o;
    return Objects.equals(this.account, obPartyRelationships1.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1 {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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


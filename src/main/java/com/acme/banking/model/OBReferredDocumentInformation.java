package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.ExternalDocumentType1Code;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReferredDocumentInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBReferredDocumentInformation {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ExternalDocumentType1Code code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String issuer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String number;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date relatedDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> lineDetails = new ArrayList<>();

  public OBReferredDocumentInformation code(@Nullable ExternalDocumentType1Code code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public @Nullable ExternalDocumentType1Code getCode() {
    return code;
  }

  @JsonProperty("Code")
  public void setCode(@Nullable ExternalDocumentType1Code code) {
    this.code = code;
  }

  public OBReferredDocumentInformation issuer(@Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Identification of the issuer of the reference document type.
   * @return issuer
   */
  
  @Schema(name = "Issuer", description = "Identification of the issuer of the reference document type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Issuer")
  public @Nullable String getIssuer() {
    return issuer;
  }

  @JsonProperty("Issuer")
  public void setIssuer(@Nullable String issuer) {
    this.issuer = issuer;
  }

  public OBReferredDocumentInformation number(@Nullable String number) {
    this.number = number;
    return this;
  }

  /**
   * Identification of the type specified for the referred document line.
   * @return number
   */
  
  @Schema(name = "Number", description = "Identification of the type specified for the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Number")
  public @Nullable String getNumber() {
    return number;
  }

  @JsonProperty("Number")
  public void setNumber(@Nullable String number) {
    this.number = number;
  }

  public OBReferredDocumentInformation relatedDate(@Nullable Date relatedDate) {
    this.relatedDate = relatedDate;
    return this;
  }

  /**
   * Date associated with the referred document line.
   * @return relatedDate
   */
  
  @Schema(name = "RelatedDate", description = "Date associated with the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RelatedDate")
  public @Nullable Date getRelatedDate() {
    return relatedDate;
  }

  @JsonProperty("RelatedDate")
  public void setRelatedDate(@Nullable Date relatedDate) {
    this.relatedDate = relatedDate;
  }

  public OBReferredDocumentInformation lineDetails(List<String> lineDetails) {
    this.lineDetails = lineDetails;
    return this;
  }

  public OBReferredDocumentInformation addLineDetailsItem(String lineDetailsItem) {
    if (this.lineDetails == null) {
      this.lineDetails = new ArrayList<>();
    }
    this.lineDetails.add(lineDetailsItem);
    return this;
  }

  /**
   * Set of elements used to provide the content of the referred document line.
   * @return lineDetails
   */
  
  @Schema(name = "LineDetails", description = "Set of elements used to provide the content of the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LineDetails")
  public List<String> getLineDetails() {
    return lineDetails;
  }

  @JsonProperty("LineDetails")
  public void setLineDetails(List<String> lineDetails) {
    this.lineDetails = lineDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReferredDocumentInformation obReferredDocumentInformation = (OBReferredDocumentInformation) o;
    return Objects.equals(this.code, obReferredDocumentInformation.code) &&
        Objects.equals(this.issuer, obReferredDocumentInformation.issuer) &&
        Objects.equals(this.number, obReferredDocumentInformation.number) &&
        Objects.equals(this.relatedDate, obReferredDocumentInformation.relatedDate) &&
        Objects.equals(this.lineDetails, obReferredDocumentInformation.lineDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer, number, relatedDate, lineDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReferredDocumentInformation {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    relatedDate: ").append(toIndentedString(relatedDate)).append("\n");
    sb.append("    lineDetails: ").append(toIndentedString(lineDetails)).append("\n");
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


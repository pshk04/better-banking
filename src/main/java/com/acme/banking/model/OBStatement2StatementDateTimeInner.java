package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details of a generic date time for the statement resource.
 */

@Schema(name = "OBStatement2_StatementDateTime_inner", description = "Set of elements used to provide details of a generic date time for the statement resource.")
@JsonTypeName("OBStatement2_StatementDateTime_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBStatement2StatementDateTimeInner {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTime;

  private String type;

  public OBStatement2StatementDateTimeInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementDateTimeInner(Date dateTime, String type) {
    this.dateTime = dateTime;
    this.type = type;
  }

  public OBStatement2StatementDateTimeInner dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Date and time associated with the date time type. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
   */
  @NotNull
  @Schema(name = "DateTime", example = "2024-05-29T00:00Z", description = "Date and time associated with the date time type. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("DateTime")
  public Date getDateTime() {
    return dateTime;
  }

  @JsonProperty("DateTime")
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public OBStatement2StatementDateTimeInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Date time type, in a coded form. For a full list of values see `OBInternalStatementDateTimeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return type
   */
  @NotNull
  @Schema(name = "Type", example = "UK.OBIE.NextStatement", description = "Date time type, in a coded form. For a full list of values see `OBInternalStatementDateTimeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  @JsonProperty("Type")
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementDateTimeInner obStatement2StatementDateTimeInner = (OBStatement2StatementDateTimeInner) o;
    return Objects.equals(this.dateTime, obStatement2StatementDateTimeInner.dateTime) &&
        Objects.equals(this.type, obStatement2StatementDateTimeInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementDateTimeInner {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


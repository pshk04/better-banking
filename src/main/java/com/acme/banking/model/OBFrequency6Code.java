package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * For a full list of values see `OBFrequency6Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public enum OBFrequency6Code implements OBFrequency6Type {
  
  ADHO("ADHO"),
  
  YEAR("YEAR"),
  
  DAIL("DAIL"),
  
  FRTN("FRTN"),
  
  INDA("INDA"),
  
  MNTH("MNTH"),
  
  QURT("QURT"),
  
  MIAN("MIAN"),
  
  WEEK("WEEK"),
  
  WODL("WODL"),
  
  FOWK("FOWK"),
  
  TWMH("TWMH"),
  
  FOMH("FOMH"),
  
  FIMH("FIMH"),
  
  ALMH("ALMH"),
  
  NONE("NONE"),
  
  LWMH("LWMH"),
  
  LXMH("LXMH"),
  
  TWYR("TWYR");

  private final String value;

  OBFrequency6Code(String value) {
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
  public static OBFrequency6Code fromValue(String value) {
    for (OBFrequency6Code b : OBFrequency6Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


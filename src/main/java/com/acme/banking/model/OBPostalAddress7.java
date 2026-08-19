package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OBAddressType2Code;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */

@Schema(name = "OBPostalAddress7", description = "Information that locates and identifies a specific address, as defined by postal services.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class OBPostalAddress7 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OBAddressType2Code addressType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String department;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String subDepartment;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String streetName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String buildingNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String buildingName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String floor;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String unitNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String room;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String postBox;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String townLocationName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String districtName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String careOf;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String postCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String townName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String countrySubDivision;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String country;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> addressLine = new ArrayList<>();

  public OBPostalAddress7 addressType(@Nullable OBAddressType2Code addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
   */
  
  @Schema(name = "AddressType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressType")
  public @Nullable OBAddressType2Code getAddressType() {
    return addressType;
  }

  @JsonProperty("AddressType")
  public void setAddressType(@Nullable OBAddressType2Code addressType) {
    this.addressType = addressType;
  }

  public OBPostalAddress7 department(@Nullable String department) {
    this.department = department;
    return this;
  }

  /**
   * Identification of a division of a large organisation or building.
   * @return department
   */
  
  @Schema(name = "Department", example = "Finance", description = "Identification of a division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Department")
  public @Nullable String getDepartment() {
    return department;
  }

  @JsonProperty("Department")
  public void setDepartment(@Nullable String department) {
    this.department = department;
  }

  public OBPostalAddress7 subDepartment(@Nullable String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
   */
  
  @Schema(name = "SubDepartment", example = "Payroll", description = "Identification of a sub-division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubDepartment")
  public @Nullable String getSubDepartment() {
    return subDepartment;
  }

  @JsonProperty("SubDepartment")
  public void setSubDepartment(@Nullable String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public OBPostalAddress7 streetName(@Nullable String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
   */
  
  @Schema(name = "StreetName", example = "Bank Street", description = "Name of a street or thoroughfare.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StreetName")
  public @Nullable String getStreetName() {
    return streetName;
  }

  @JsonProperty("StreetName")
  public void setStreetName(@Nullable String streetName) {
    this.streetName = streetName;
  }

  public OBPostalAddress7 buildingNumber(@Nullable String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
   */
  
  @Schema(name = "BuildingNumber", example = "11", description = "Number that identifies the position of a building on a street.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildingNumber")
  public @Nullable String getBuildingNumber() {
    return buildingNumber;
  }

  @JsonProperty("BuildingNumber")
  public void setBuildingNumber(@Nullable String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBPostalAddress7 buildingName(@Nullable String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Name of a referenced building.
   * @return buildingName
   */
  
  @Schema(name = "BuildingName", description = "Name of a referenced building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildingName")
  public @Nullable String getBuildingName() {
    return buildingName;
  }

  @JsonProperty("BuildingName")
  public void setBuildingName(@Nullable String buildingName) {
    this.buildingName = buildingName;
  }

  public OBPostalAddress7 floor(@Nullable String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * Number that identifies the level within a building
   * @return floor
   */
  
  @Schema(name = "Floor", example = "11", description = "Number that identifies the level within a building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Floor")
  public @Nullable String getFloor() {
    return floor;
  }

  @JsonProperty("Floor")
  public void setFloor(@Nullable String floor) {
    this.floor = floor;
  }

  public OBPostalAddress7 unitNumber(@Nullable String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  /**
   * Number that identifies the unit of a specific address .
   * @return unitNumber
   */
  
  @Schema(name = "UnitNumber", example = "A88", description = "Number that identifies the unit of a specific address .", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UnitNumber")
  public @Nullable String getUnitNumber() {
    return unitNumber;
  }

  @JsonProperty("UnitNumber")
  public void setUnitNumber(@Nullable String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public OBPostalAddress7 room(@Nullable String room) {
    this.room = room;
    return this;
  }

  /**
   * Information that locates and identifies a room to form part of an address
   * @return room
   */
  
  @Schema(name = "Room", example = "Basement 03", description = "Information that locates and identifies a room to form part of an address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Room")
  public @Nullable String getRoom() {
    return room;
  }

  @JsonProperty("Room")
  public void setRoom(@Nullable String room) {
    this.room = room;
  }

  public OBPostalAddress7 postBox(@Nullable String postBox) {
    this.postBox = postBox;
    return this;
  }

  /**
   * Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.
   * @return postBox
   */
  
  @Schema(name = "PostBox", example = "PO Box 123456", description = "Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostBox")
  public @Nullable String getPostBox() {
    return postBox;
  }

  @JsonProperty("PostBox")
  public void setPostBox(@Nullable String postBox) {
    this.postBox = postBox;
  }

  public OBPostalAddress7 townLocationName(@Nullable String townLocationName) {
    this.townLocationName = townLocationName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townLocationName
   */
  
  @Schema(name = "TownLocationName", example = "London", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TownLocationName")
  public @Nullable String getTownLocationName() {
    return townLocationName;
  }

  @JsonProperty("TownLocationName")
  public void setTownLocationName(@Nullable String townLocationName) {
    this.townLocationName = townLocationName;
  }

  public OBPostalAddress7 districtName(@Nullable String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Number that of the regional area, known as a district, which forms part of an address
   * @return districtName
   */
  
  @Schema(name = "DistrictName", example = "Greater London", description = "Number that of the regional area, known as a district, which forms part of an address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DistrictName")
  public @Nullable String getDistrictName() {
    return districtName;
  }

  @JsonProperty("DistrictName")
  public void setDistrictName(@Nullable String districtName) {
    this.districtName = districtName;
  }

  public OBPostalAddress7 careOf(@Nullable String careOf) {
    this.careOf = careOf;
    return this;
  }

  /**
   * The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.
   * @return careOf
   */
  
  @Schema(name = "CareOf", example = "Jane Smith", description = "The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CareOf")
  public @Nullable String getCareOf() {
    return careOf;
  }

  @JsonProperty("CareOf")
  public void setCareOf(@Nullable String careOf) {
    this.careOf = careOf;
  }

  public OBPostalAddress7 postCode(@Nullable String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
   */
  
  @Schema(name = "PostCode", example = "EC2N 4AG", description = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostCode")
  public @Nullable String getPostCode() {
    return postCode;
  }

  @JsonProperty("PostCode")
  public void setPostCode(@Nullable String postCode) {
    this.postCode = postCode;
  }

  public OBPostalAddress7 townName(@Nullable String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
   */
  
  @Schema(name = "TownName", example = "London", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TownName")
  public @Nullable String getTownName() {
    return townName;
  }

  @JsonProperty("TownName")
  public void setTownName(@Nullable String townName) {
    this.townName = townName;
  }

  public OBPostalAddress7 countrySubDivision(@Nullable String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
   */
  
  @Schema(name = "CountrySubDivision", description = "Identifies a subdivision of a country such as state, region, county.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CountrySubDivision")
  public @Nullable String getCountrySubDivision() {
    return countrySubDivision;
  }

  @JsonProperty("CountrySubDivision")
  public void setCountrySubDivision(@Nullable String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBPostalAddress7 country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government.
   * @return country
   */
  
  @Schema(name = "Country", description = "Nation with its own government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Country")
  public @Nullable String getCountry() {
    return country;
  }

  @JsonProperty("Country")
  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public OBPostalAddress7 addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress7 addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
   */
  
  @Schema(name = "AddressLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressLine")
  public List<String> getAddressLine() {
    return addressLine;
  }

  @JsonProperty("AddressLine")
  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPostalAddress7 obPostalAddress7 = (OBPostalAddress7) o;
    return Objects.equals(this.addressType, obPostalAddress7.addressType) &&
        Objects.equals(this.department, obPostalAddress7.department) &&
        Objects.equals(this.subDepartment, obPostalAddress7.subDepartment) &&
        Objects.equals(this.streetName, obPostalAddress7.streetName) &&
        Objects.equals(this.buildingNumber, obPostalAddress7.buildingNumber) &&
        Objects.equals(this.buildingName, obPostalAddress7.buildingName) &&
        Objects.equals(this.floor, obPostalAddress7.floor) &&
        Objects.equals(this.unitNumber, obPostalAddress7.unitNumber) &&
        Objects.equals(this.room, obPostalAddress7.room) &&
        Objects.equals(this.postBox, obPostalAddress7.postBox) &&
        Objects.equals(this.townLocationName, obPostalAddress7.townLocationName) &&
        Objects.equals(this.districtName, obPostalAddress7.districtName) &&
        Objects.equals(this.careOf, obPostalAddress7.careOf) &&
        Objects.equals(this.postCode, obPostalAddress7.postCode) &&
        Objects.equals(this.townName, obPostalAddress7.townName) &&
        Objects.equals(this.countrySubDivision, obPostalAddress7.countrySubDivision) &&
        Objects.equals(this.country, obPostalAddress7.country) &&
        Objects.equals(this.addressLine, obPostalAddress7.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, department, subDepartment, streetName, buildingNumber, buildingName, floor, unitNumber, room, postBox, townLocationName, districtName, careOf, postCode, townName, countrySubDivision, country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress7 {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    postBox: ").append(toIndentedString(postBox)).append("\n");
    sb.append("    townLocationName: ").append(toIndentedString(townLocationName)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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


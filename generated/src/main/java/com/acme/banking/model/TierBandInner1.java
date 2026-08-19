package com.acme.banking.model;

import java.net.URI;
import java.util.Objects;
import com.acme.banking.model.OtherApplicationFrequency;
import com.acme.banking.model.OtherBankInterestType;
import com.acme.banking.model.OtherCalculationFrequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Tier Band Details
 */

@Schema(name = "TierBand_inner_1", description = "Tier Band Details")
@JsonTypeName("TierBand_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
public class TierBandInner1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String identification;

  private String tierValueMinimum;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String tierValueMaximum;

  /**
   * How often is credit interest calculated for the account.
   */
  public enum CalculationFrequencyEnum {
    PER_ACADEMIC_TERM("PerAcademicTerm"),
    
    DAILY("Daily"),
    
    HALF_YEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    PER_STATEMENT_DATE("PerStatementDate"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private final String value;

    CalculationFrequencyEnum(String value) {
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
    public static CalculationFrequencyEnum fromValue(String value) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CalculationFrequencyEnum calculationFrequency;

  /**
   * How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's PCA.
   */
  public enum ApplicationFrequencyEnum {
    PER_ACADEMIC_TERM("PerAcademicTerm"),
    
    DAILY("Daily"),
    
    HALF_YEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    PER_STATEMENT_DATE("PerStatementDate"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private final String value;

    ApplicationFrequencyEnum(String value) {
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
    public static ApplicationFrequencyEnum fromValue(String value) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ApplicationFrequencyEnum applicationFrequency;

  /**
   * Amount on which Interest applied.
   */
  public enum DepositInterestAppliedCoverageEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private final String value;

    DepositInterestAppliedCoverageEnum(String value) {
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
    public static DepositInterestAppliedCoverageEnum fromValue(String value) {
      for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage;

  /**
   * Type of interest rate, Fixed or Variable
   */
  public enum FixedVariableInterestRateTypeEnum {
    FIXED("Fixed"),
    
    VARIABLE("Variable");

    private final String value;

    FixedVariableInterestRateTypeEnum(String value) {
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
    public static FixedVariableInterestRateTypeEnum fromValue(String value) {
      for (FixedVariableInterestRateTypeEnum b : FixedVariableInterestRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FixedVariableInterestRateTypeEnum fixedVariableInterestRateType;

  private String AER;

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.
   */
  public enum BankInterestRateTypeEnum {
    LINKED_BASE_RATE("LinkedBaseRate"),
    
    GROSS("Gross"),
    
    NET("Net"),
    
    OTHER("Other");

    private final String value;

    BankInterestRateTypeEnum(String value) {
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
    public static BankInterestRateTypeEnum fromValue(String value) {
      for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BankInterestRateTypeEnum bankInterestRateType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String bankInterestRate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> notes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherBankInterestType otherBankInterestType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherApplicationFrequency otherApplicationFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OtherCalculationFrequency otherCalculationFrequency;

  public TierBandInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TierBandInner1(String tierValueMinimum, ApplicationFrequencyEnum applicationFrequency, FixedVariableInterestRateTypeEnum fixedVariableInterestRateType, String AER) {
    this.tierValueMinimum = tierValueMinimum;
    this.applicationFrequency = applicationFrequency;
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    this.AER = AER;
  }

  public TierBandInner1 identification(@Nullable String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a PCA.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a PCA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public @Nullable String getIdentification() {
    return identification;
  }

  @JsonProperty("Identification")
  public void setIdentification(@Nullable String identification) {
    this.identification = identification;
  }

  public TierBandInner1 tierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
    return this;
  }

  /**
   * Minimum deposit value for which the credit interest tier applies.
   * @return tierValueMinimum
   */
  @NotNull
  @Schema(name = "TierValueMinimum", description = "Minimum deposit value for which the credit interest tier applies.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierValueMinimum")
  public String getTierValueMinimum() {
    return tierValueMinimum;
  }

  @JsonProperty("TierValueMinimum")
  public void setTierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
  }

  public TierBandInner1 tierValueMaximum(@Nullable String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
    return this;
  }

  /**
   * Maximum deposit value for which the credit interest tier applies.
   * @return tierValueMaximum
   */
  
  @Schema(name = "TierValueMaximum", description = "Maximum deposit value for which the credit interest tier applies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TierValueMaximum")
  public @Nullable String getTierValueMaximum() {
    return tierValueMaximum;
  }

  @JsonProperty("TierValueMaximum")
  public void setTierValueMaximum(@Nullable String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
  }

  public TierBandInner1 calculationFrequency(@Nullable CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How often is credit interest calculated for the account.
   * @return calculationFrequency
   */
  
  @Schema(name = "CalculationFrequency", description = "How often is credit interest calculated for the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationFrequency")
  public @Nullable CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  @JsonProperty("CalculationFrequency")
  public void setCalculationFrequency(@Nullable CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public TierBandInner1 applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's PCA.
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", description = "How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's PCA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  @JsonProperty("ApplicationFrequency")
  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public TierBandInner1 depositInterestAppliedCoverage(@Nullable DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    return this;
  }

  /**
   * Amount on which Interest applied.
   * @return depositInterestAppliedCoverage
   */
  
  @Schema(name = "DepositInterestAppliedCoverage", description = "Amount on which Interest applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DepositInterestAppliedCoverage")
  public @Nullable DepositInterestAppliedCoverageEnum getDepositInterestAppliedCoverage() {
    return depositInterestAppliedCoverage;
  }

  @JsonProperty("DepositInterestAppliedCoverage")
  public void setDepositInterestAppliedCoverage(@Nullable DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
  }

  public TierBandInner1 fixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    return this;
  }

  /**
   * Type of interest rate, Fixed or Variable
   * @return fixedVariableInterestRateType
   */
  @NotNull
  @Schema(name = "FixedVariableInterestRateType", description = "Type of interest rate, Fixed or Variable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FixedVariableInterestRateType")
  public FixedVariableInterestRateTypeEnum getFixedVariableInterestRateType() {
    return fixedVariableInterestRateType;
  }

  @JsonProperty("FixedVariableInterestRateType")
  public void setFixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
  }

  public TierBandInner1 AER(String AER) {
    this.AER = AER;
    return this;
  }

  /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
   * @return AER
   */
  @NotNull
  @Schema(name = "AER", description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AER")
  public String getAER() {
    return AER;
  }

  @JsonProperty("AER")
  public void setAER(String AER) {
    this.AER = AER;
  }

  public TierBandInner1 bankInterestRateType(@Nullable BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.
   * @return bankInterestRateType
   */
  
  @Schema(name = "BankInterestRateType", description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankInterestRateType")
  public @Nullable BankInterestRateTypeEnum getBankInterestRateType() {
    return bankInterestRateType;
  }

  @JsonProperty("BankInterestRateType")
  public void setBankInterestRateType(@Nullable BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
  }

  public TierBandInner1 bankInterestRate(@Nullable String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

  /**
   * Bank Interest for the PCA product
   * @return bankInterestRate
   */
  
  @Schema(name = "BankInterestRate", description = "Bank Interest for the PCA product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankInterestRate")
  public @Nullable String getBankInterestRate() {
    return bankInterestRate;
  }

  @JsonProperty("BankInterestRate")
  public void setBankInterestRate(@Nullable String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public TierBandInner1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public TierBandInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band details
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier Band details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  @JsonProperty("Notes")
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public TierBandInner1 otherBankInterestType(@Nullable OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

  /**
   * Get otherBankInterestType
   * @return otherBankInterestType
   */
  
  @Schema(name = "OtherBankInterestType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherBankInterestType")
  public @Nullable OtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  @JsonProperty("OtherBankInterestType")
  public void setOtherBankInterestType(@Nullable OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public TierBandInner1 otherApplicationFrequency(@Nullable OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   */
  
  @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherApplicationFrequency")
  public @Nullable OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  @JsonProperty("OtherApplicationFrequency")
  public void setOtherApplicationFrequency(@Nullable OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public TierBandInner1 otherCalculationFrequency(@Nullable OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   */
  
  @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationFrequency")
  public @Nullable OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  @JsonProperty("OtherCalculationFrequency")
  public void setOtherCalculationFrequency(@Nullable OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TierBandInner1 tierBandInner1 = (TierBandInner1) o;
    return Objects.equals(this.identification, tierBandInner1.identification) &&
        Objects.equals(this.tierValueMinimum, tierBandInner1.tierValueMinimum) &&
        Objects.equals(this.tierValueMaximum, tierBandInner1.tierValueMaximum) &&
        Objects.equals(this.calculationFrequency, tierBandInner1.calculationFrequency) &&
        Objects.equals(this.applicationFrequency, tierBandInner1.applicationFrequency) &&
        Objects.equals(this.depositInterestAppliedCoverage, tierBandInner1.depositInterestAppliedCoverage) &&
        Objects.equals(this.fixedVariableInterestRateType, tierBandInner1.fixedVariableInterestRateType) &&
        Objects.equals(this.AER, tierBandInner1.AER) &&
        Objects.equals(this.bankInterestRateType, tierBandInner1.bankInterestRateType) &&
        Objects.equals(this.bankInterestRate, tierBandInner1.bankInterestRate) &&
        Objects.equals(this.notes, tierBandInner1.notes) &&
        Objects.equals(this.otherBankInterestType, tierBandInner1.otherBankInterestType) &&
        Objects.equals(this.otherApplicationFrequency, tierBandInner1.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, tierBandInner1.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierBandInner1 {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
    sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
    sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
    sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
    sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
    sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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


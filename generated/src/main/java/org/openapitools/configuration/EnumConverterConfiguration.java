package org.openapitools.configuration;

import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;

import com.acme.banking.model.ExternalCategoryPurpose1Code;
import com.acme.banking.model.ExternalCreditorReferenceType1Code;
import com.acme.banking.model.ExternalDocumentType1Code;
import com.acme.banking.model.ExternalEntryStatus1Code;
import com.acme.banking.model.ExternalMandateStatus1Code;
import com.acme.banking.model.ExternalProxyAccountType1Code;
import com.acme.banking.model.OBAddressType2Code;
import com.acme.banking.model.OBBalanceType1Code;
import com.acme.banking.model.OBCommunicationMethod;
import com.acme.banking.model.OBCreditDebitCode0;
import com.acme.banking.model.OBCreditDebitCode1;
import com.acme.banking.model.OBCreditDebitCode2;
import com.acme.banking.model.OBExternalAccountSubType1Code;
import com.acme.banking.model.OBExternalBalanceSubType1Code;
import com.acme.banking.model.OBExternalMandateClassification1Code;
import com.acme.banking.model.OBExternalPurpose1Code;
import com.acme.banking.model.OBFeeCategory1Code;
import com.acme.banking.model.OBFeeFrequency1Code0;
import com.acme.banking.model.OBFeeFrequency1Code1;
import com.acme.banking.model.OBFeeFrequency1Code2;
import com.acme.banking.model.OBFeeFrequency1Code3;
import com.acme.banking.model.OBFeeFrequency1Code4;
import com.acme.banking.model.OBFeeType1Code;
import com.acme.banking.model.OBFileFormat;
import com.acme.banking.model.OBFrequency2;
import com.acme.banking.model.OBFrequency6Code;
import com.acme.banking.model.OBFrequencyPeriodType;
import com.acme.banking.model.OBInterestCalculationMethod1Code;
import com.acme.banking.model.OBInterestFixedVariableType1Code;
import com.acme.banking.model.OBInterestRateType1Code0;
import com.acme.banking.model.OBInterestRateType1Code1;
import com.acme.banking.model.OBInternalAccountStatus1Code;
import com.acme.banking.model.OBInternalAccountType1Code;
import com.acme.banking.model.OBInternalBeneficiaryType1Code;
import com.acme.banking.model.OBInternalConsentStatus1Code;
import com.acme.banking.model.OBInternalPartyType1Code;
import com.acme.banking.model.OBInternalScheduleType1Code;
import com.acme.banking.model.OBInternalStatementType1Code;
import com.acme.banking.model.OBInternalTransactionMutability1Code;
import com.acme.banking.model.OBMinMaxType1Code;
import com.acme.banking.model.OBOverdraftFeeType1Code;
import com.acme.banking.model.OBPeriod1Code;

import jakarta.annotation.Generated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-19T12:42:14.469714-06:00[America/Boise]", comments = "Generator version: 7.24.0")
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalCategoryPurpose1CodeConverter")
    Converter<String, ExternalCategoryPurpose1Code> externalCategoryPurpose1CodeConverter() {
        return new Converter<String, ExternalCategoryPurpose1Code>() {
            @Override
            public ExternalCategoryPurpose1Code convert(String source) {
                return ExternalCategoryPurpose1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalCreditorReferenceType1CodeConverter")
    Converter<String, ExternalCreditorReferenceType1Code> externalCreditorReferenceType1CodeConverter() {
        return new Converter<String, ExternalCreditorReferenceType1Code>() {
            @Override
            public ExternalCreditorReferenceType1Code convert(String source) {
                return ExternalCreditorReferenceType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalDocumentType1CodeConverter")
    Converter<String, ExternalDocumentType1Code> externalDocumentType1CodeConverter() {
        return new Converter<String, ExternalDocumentType1Code>() {
            @Override
            public ExternalDocumentType1Code convert(String source) {
                return ExternalDocumentType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalEntryStatus1CodeConverter")
    Converter<String, ExternalEntryStatus1Code> externalEntryStatus1CodeConverter() {
        return new Converter<String, ExternalEntryStatus1Code>() {
            @Override
            public ExternalEntryStatus1Code convert(String source) {
                return ExternalEntryStatus1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalMandateStatus1CodeConverter")
    Converter<String, ExternalMandateStatus1Code> externalMandateStatus1CodeConverter() {
        return new Converter<String, ExternalMandateStatus1Code>() {
            @Override
            public ExternalMandateStatus1Code convert(String source) {
                return ExternalMandateStatus1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalProxyAccountType1CodeConverter")
    Converter<String, ExternalProxyAccountType1Code> externalProxyAccountType1CodeConverter() {
        return new Converter<String, ExternalProxyAccountType1Code>() {
            @Override
            public ExternalProxyAccountType1Code convert(String source) {
                return ExternalProxyAccountType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obAddressType2CodeConverter")
    Converter<String, OBAddressType2Code> obAddressType2CodeConverter() {
        return new Converter<String, OBAddressType2Code>() {
            @Override
            public OBAddressType2Code convert(String source) {
                return OBAddressType2Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obBalanceType1CodeConverter")
    Converter<String, OBBalanceType1Code> obBalanceType1CodeConverter() {
        return new Converter<String, OBBalanceType1Code>() {
            @Override
            public OBBalanceType1Code convert(String source) {
                return OBBalanceType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obCommunicationMethodConverter")
    Converter<String, OBCommunicationMethod> obCommunicationMethodConverter() {
        return new Converter<String, OBCommunicationMethod>() {
            @Override
            public OBCommunicationMethod convert(String source) {
                return OBCommunicationMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obCreditDebitCode0Converter")
    Converter<String, OBCreditDebitCode0> obCreditDebitCode0Converter() {
        return new Converter<String, OBCreditDebitCode0>() {
            @Override
            public OBCreditDebitCode0 convert(String source) {
                return OBCreditDebitCode0.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obCreditDebitCode1Converter")
    Converter<String, OBCreditDebitCode1> obCreditDebitCode1Converter() {
        return new Converter<String, OBCreditDebitCode1>() {
            @Override
            public OBCreditDebitCode1 convert(String source) {
                return OBCreditDebitCode1.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obCreditDebitCode2Converter")
    Converter<String, OBCreditDebitCode2> obCreditDebitCode2Converter() {
        return new Converter<String, OBCreditDebitCode2>() {
            @Override
            public OBCreditDebitCode2 convert(String source) {
                return OBCreditDebitCode2.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obExternalAccountSubType1CodeConverter")
    Converter<String, OBExternalAccountSubType1Code> obExternalAccountSubType1CodeConverter() {
        return new Converter<String, OBExternalAccountSubType1Code>() {
            @Override
            public OBExternalAccountSubType1Code convert(String source) {
                return OBExternalAccountSubType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obExternalBalanceSubType1CodeConverter")
    Converter<String, OBExternalBalanceSubType1Code> obExternalBalanceSubType1CodeConverter() {
        return new Converter<String, OBExternalBalanceSubType1Code>() {
            @Override
            public OBExternalBalanceSubType1Code convert(String source) {
                return OBExternalBalanceSubType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obExternalMandateClassification1CodeConverter")
    Converter<String, OBExternalMandateClassification1Code> obExternalMandateClassification1CodeConverter() {
        return new Converter<String, OBExternalMandateClassification1Code>() {
            @Override
            public OBExternalMandateClassification1Code convert(String source) {
                return OBExternalMandateClassification1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obExternalPurpose1CodeConverter")
    Converter<String, OBExternalPurpose1Code> obExternalPurpose1CodeConverter() {
        return new Converter<String, OBExternalPurpose1Code>() {
            @Override
            public OBExternalPurpose1Code convert(String source) {
                return OBExternalPurpose1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeCategory1CodeConverter")
    Converter<String, OBFeeCategory1Code> obFeeCategory1CodeConverter() {
        return new Converter<String, OBFeeCategory1Code>() {
            @Override
            public OBFeeCategory1Code convert(String source) {
                return OBFeeCategory1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeFrequency1Code0Converter")
    Converter<String, OBFeeFrequency1Code0> obFeeFrequency1Code0Converter() {
        return new Converter<String, OBFeeFrequency1Code0>() {
            @Override
            public OBFeeFrequency1Code0 convert(String source) {
                return OBFeeFrequency1Code0.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeFrequency1Code1Converter")
    Converter<String, OBFeeFrequency1Code1> obFeeFrequency1Code1Converter() {
        return new Converter<String, OBFeeFrequency1Code1>() {
            @Override
            public OBFeeFrequency1Code1 convert(String source) {
                return OBFeeFrequency1Code1.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeFrequency1Code2Converter")
    Converter<String, OBFeeFrequency1Code2> obFeeFrequency1Code2Converter() {
        return new Converter<String, OBFeeFrequency1Code2>() {
            @Override
            public OBFeeFrequency1Code2 convert(String source) {
                return OBFeeFrequency1Code2.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeFrequency1Code3Converter")
    Converter<String, OBFeeFrequency1Code3> obFeeFrequency1Code3Converter() {
        return new Converter<String, OBFeeFrequency1Code3>() {
            @Override
            public OBFeeFrequency1Code3 convert(String source) {
                return OBFeeFrequency1Code3.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeFrequency1Code4Converter")
    Converter<String, OBFeeFrequency1Code4> obFeeFrequency1Code4Converter() {
        return new Converter<String, OBFeeFrequency1Code4>() {
            @Override
            public OBFeeFrequency1Code4 convert(String source) {
                return OBFeeFrequency1Code4.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFeeType1CodeConverter")
    Converter<String, OBFeeType1Code> obFeeType1CodeConverter() {
        return new Converter<String, OBFeeType1Code>() {
            @Override
            public OBFeeType1Code convert(String source) {
                return OBFeeType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFileFormatConverter")
    Converter<String, OBFileFormat> obFileFormatConverter() {
        return new Converter<String, OBFileFormat>() {
            @Override
            public OBFileFormat convert(String source) {
                return OBFileFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFrequency2Converter")
    Converter<String, OBFrequency2> obFrequency2Converter() {
        return new Converter<String, OBFrequency2>() {
            @Override
            public OBFrequency2 convert(String source) {
                return OBFrequency2.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFrequency6CodeConverter")
    Converter<String, OBFrequency6Code> obFrequency6CodeConverter() {
        return new Converter<String, OBFrequency6Code>() {
            @Override
            public OBFrequency6Code convert(String source) {
                return OBFrequency6Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obFrequencyPeriodTypeConverter")
    Converter<String, OBFrequencyPeriodType> obFrequencyPeriodTypeConverter() {
        return new Converter<String, OBFrequencyPeriodType>() {
            @Override
            public OBFrequencyPeriodType convert(String source) {
                return OBFrequencyPeriodType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInterestCalculationMethod1CodeConverter")
    Converter<String, OBInterestCalculationMethod1Code> obInterestCalculationMethod1CodeConverter() {
        return new Converter<String, OBInterestCalculationMethod1Code>() {
            @Override
            public OBInterestCalculationMethod1Code convert(String source) {
                return OBInterestCalculationMethod1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInterestFixedVariableType1CodeConverter")
    Converter<String, OBInterestFixedVariableType1Code> obInterestFixedVariableType1CodeConverter() {
        return new Converter<String, OBInterestFixedVariableType1Code>() {
            @Override
            public OBInterestFixedVariableType1Code convert(String source) {
                return OBInterestFixedVariableType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInterestRateType1Code0Converter")
    Converter<String, OBInterestRateType1Code0> obInterestRateType1Code0Converter() {
        return new Converter<String, OBInterestRateType1Code0>() {
            @Override
            public OBInterestRateType1Code0 convert(String source) {
                return OBInterestRateType1Code0.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInterestRateType1Code1Converter")
    Converter<String, OBInterestRateType1Code1> obInterestRateType1Code1Converter() {
        return new Converter<String, OBInterestRateType1Code1>() {
            @Override
            public OBInterestRateType1Code1 convert(String source) {
                return OBInterestRateType1Code1.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalAccountStatus1CodeConverter")
    Converter<String, OBInternalAccountStatus1Code> obInternalAccountStatus1CodeConverter() {
        return new Converter<String, OBInternalAccountStatus1Code>() {
            @Override
            public OBInternalAccountStatus1Code convert(String source) {
                return OBInternalAccountStatus1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalAccountType1CodeConverter")
    Converter<String, OBInternalAccountType1Code> obInternalAccountType1CodeConverter() {
        return new Converter<String, OBInternalAccountType1Code>() {
            @Override
            public OBInternalAccountType1Code convert(String source) {
                return OBInternalAccountType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalBeneficiaryType1CodeConverter")
    Converter<String, OBInternalBeneficiaryType1Code> obInternalBeneficiaryType1CodeConverter() {
        return new Converter<String, OBInternalBeneficiaryType1Code>() {
            @Override
            public OBInternalBeneficiaryType1Code convert(String source) {
                return OBInternalBeneficiaryType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalConsentStatus1CodeConverter")
    Converter<String, OBInternalConsentStatus1Code> obInternalConsentStatus1CodeConverter() {
        return new Converter<String, OBInternalConsentStatus1Code>() {
            @Override
            public OBInternalConsentStatus1Code convert(String source) {
                return OBInternalConsentStatus1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalPartyType1CodeConverter")
    Converter<String, OBInternalPartyType1Code> obInternalPartyType1CodeConverter() {
        return new Converter<String, OBInternalPartyType1Code>() {
            @Override
            public OBInternalPartyType1Code convert(String source) {
                return OBInternalPartyType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalScheduleType1CodeConverter")
    Converter<String, OBInternalScheduleType1Code> obInternalScheduleType1CodeConverter() {
        return new Converter<String, OBInternalScheduleType1Code>() {
            @Override
            public OBInternalScheduleType1Code convert(String source) {
                return OBInternalScheduleType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalStatementType1CodeConverter")
    Converter<String, OBInternalStatementType1Code> obInternalStatementType1CodeConverter() {
        return new Converter<String, OBInternalStatementType1Code>() {
            @Override
            public OBInternalStatementType1Code convert(String source) {
                return OBInternalStatementType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obInternalTransactionMutability1CodeConverter")
    Converter<String, OBInternalTransactionMutability1Code> obInternalTransactionMutability1CodeConverter() {
        return new Converter<String, OBInternalTransactionMutability1Code>() {
            @Override
            public OBInternalTransactionMutability1Code convert(String source) {
                return OBInternalTransactionMutability1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obMinMaxType1CodeConverter")
    Converter<String, OBMinMaxType1Code> obMinMaxType1CodeConverter() {
        return new Converter<String, OBMinMaxType1Code>() {
            @Override
            public OBMinMaxType1Code convert(String source) {
                return OBMinMaxType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obOverdraftFeeType1CodeConverter")
    Converter<String, OBOverdraftFeeType1Code> obOverdraftFeeType1CodeConverter() {
        return new Converter<String, OBOverdraftFeeType1Code>() {
            @Override
            public OBOverdraftFeeType1Code convert(String source) {
                return OBOverdraftFeeType1Code.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.obPeriod1CodeConverter")
    Converter<String, OBPeriod1Code> obPeriod1CodeConverter() {
        return new Converter<String, OBPeriod1Code>() {
            @Override
            public OBPeriod1Code convert(String source) {
                return OBPeriod1Code.fromValue(source);
            }
        };
    }

}

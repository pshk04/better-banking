package io.betterbanking.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {
    private String type;
    private Date date;
    private int accountNumber;
    private double currencyAmount;
    private String merchantName;
    private String merchantLogo;

    public Transaction(){

    }

    public Transaction(double currencyAmount, String merchantLogo, String merchantName, String type, int accountNumber) {
        this.currencyAmount = currencyAmount;
        this.merchantLogo = merchantLogo;
        this.merchantName = merchantName;
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(double currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMerchantLogo() {
        return merchantLogo;
    }

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

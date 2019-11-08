//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

import java.math.BigDecimal;

public class Price {
    private String display;
    private BigDecimal value;
    private String currencySymbol;
    private String currencyCode;
    private BigDecimal saleValue;
    private String saleDisplay;
    private Boolean isOnSale;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(BigDecimal saleValue) {
        this.saleValue = saleValue;
    }

    public String getSaleDisplay() {
        return saleDisplay;
    }

    public void setSaleDisplay(String saleDisplay) {
        this.saleDisplay = saleDisplay;
    }

    public Boolean getOnSale() {
        return isOnSale;
    }

    public void setOnSale(Boolean onSale) {
        isOnSale = onSale;
    }
}

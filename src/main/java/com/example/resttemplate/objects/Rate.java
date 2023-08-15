package com.example.resttemplate.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {

    private String ccy;

    @JsonProperty("base_ccy")
    private String baseCcy;
    private String buy;
    private String sale;

    public Rate() {}

    public Rate(String ccy, String baseCcy, String buy, String sale) {
        this.ccy = ccy;
        this.baseCcy = baseCcy;
        this.buy = buy;
        this.sale = sale;
    }

    public String getCcy() {
        return ccy;
    }

    public String getSale() {
        return sale;
    }

    @Override
    public String toString() {
        return ccy + " against " + baseCcy +
                ":" + '\n' + "buy: " + buy + "," + '\n' +
                "sale: " + sale;
    }
}

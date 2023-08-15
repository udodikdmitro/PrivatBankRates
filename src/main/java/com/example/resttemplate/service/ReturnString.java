package com.example.resttemplate.service;

public class ReturnString {
    private String rateEur;
    private String rateUSD;

    public ReturnString(){}

    public void setRateEur(String rateEur) {
        this.rateEur = rateEur;
    }

    public void setRateUSD(String rateUSD) {
        this.rateUSD = rateUSD;
    }

    public String makeString(){
        return "Курс гривні до євро: " + rateEur + ", курс гривні до долара: "
                + rateUSD + ".";
    }
}
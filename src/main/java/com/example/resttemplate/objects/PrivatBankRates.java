package com.example.resttemplate.objects;

import java.util.ArrayList;

public class PrivatBankRates {

    private ArrayList<Rate> arrayRates;

    public PrivatBankRates(ArrayList<Rate> arrayRates) {
        this.arrayRates = arrayRates;
    }

    public ArrayList<Rate> getArrayRates() {
        return arrayRates;
    }

    public void setArrayRates(ArrayList<Rate> arrayRates) {
        this.arrayRates = arrayRates;
    }
}

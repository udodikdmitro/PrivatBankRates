package com.example.resttemplate.controller;

import com.example.resttemplate.objects.Rate;
import com.example.resttemplate.service.PrivatBankService;
import com.example.resttemplate.service.ReturnString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/rates")
public class PrivatBankController {
    private final PrivatBankService privatBankService;

    @Autowired
    public PrivatBankController(PrivatBankService privatBankService) {
        this.privatBankService = privatBankService;
    }

    @GetMapping("/get")
    public ResponseEntity<String> getRates(){
        List<Rate> rates = privatBankService.getRates();
        ReturnString returnString = new ReturnString();
        for (Rate rate: rates){
            if (Objects.equals(rate.getCcy(), "EUR")){
                returnString.setRateEur(rate.getSale());
            } else {
                returnString.setRateUSD(rate.getSale());
            }
        }
        return ResponseEntity.ok(returnString.makeString());
    }
}

package com.example.resttemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrivatBankService {

    private final RestTemplate restTemplate;
    public static final String PRIVAT_BANK_RATES_ENDPOINT =
            "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5";

    @Autowired
    public PrivatBankService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getRates(){
        ResponseEntity<String> response
                = restTemplate.getForEntity(PRIVAT_BANK_RATES_ENDPOINT, String.class);
        String result = response.getBody();
        return result;
    }
}
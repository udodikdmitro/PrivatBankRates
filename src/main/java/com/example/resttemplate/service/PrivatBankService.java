package com.example.resttemplate.service;

import com.example.resttemplate.objects.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PrivatBankService {

    private final RestTemplate restTemplate;
    public static final String PRIVAT_BANK_RATES_ENDPOINT =
            "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5";

    @Autowired
    public PrivatBankService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Rate> getRates(){
        ResponseEntity<List<Rate>> response
                = restTemplate.exchange(PRIVAT_BANK_RATES_ENDPOINT, HttpMethod.GET,
                new HttpEntity<>(new HttpHeaders()),
                new ParameterizedTypeReference<List<Rate>>() {});
        List<Rate> result = response.getBody();
        return result;
    }

    //new ParameterizedTypeReference<List<Rate>>() {}
}
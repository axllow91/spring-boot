package com.mrn.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String address = "Str. Rozmarin";

    public String getAddress(){
        return address;
    }
}

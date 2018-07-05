package com.mrn.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

// I tell to spring framework that i want to use this student class as a bean
@Component
public class Student {

    @Autowired
    private Address address;

    public void showInfo() {
        System.out.println("Address: " + address.getAddress());
    }
}

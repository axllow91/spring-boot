package com.mrn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@ComponentScan
public class App {

    @Autowired
    private Student student;

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/index")
    public void sayHello() {
        student.showInfo();
    }
}

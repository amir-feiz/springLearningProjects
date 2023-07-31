package com.example.dependencyinjection.valuePackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueTest {

    @Value("${value}")
    private String valueTest;

    public String getValueTest() {
        return valueTest;
    }
}

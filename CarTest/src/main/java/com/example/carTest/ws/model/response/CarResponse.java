package com.example.carTest.ws.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarResponse {

    private String publicID;
    private String name;
    private Integer yearOfProduct;
    private String color;
}

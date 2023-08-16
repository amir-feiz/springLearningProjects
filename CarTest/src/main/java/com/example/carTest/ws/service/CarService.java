package com.example.carTest.ws.service;

import com.example.carTest.ws.model.request.CarRequest;
import com.example.carTest.ws.model.response.CarResponse;

import java.util.List;

public interface CarService {

    public CarResponse saveCar(CarRequest car);

    public CarResponse getCar(String id);

    public CarResponse updateCar(String id, CarRequest carRequest);

    public CarResponse deleteCar(String id);

    public List<CarResponse> getCars();
}

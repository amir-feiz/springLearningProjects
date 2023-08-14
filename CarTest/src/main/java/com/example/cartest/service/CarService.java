package com.example.cartest.service;

import com.example.cartest.model.request.CarRequest;
import com.example.cartest.model.response.CarResponse;

import java.util.List;

public interface CarService {

    public CarResponse saveCar(CarRequest car);

    public CarResponse getCar(String id);

    public CarResponse updateCar(String id, CarRequest carRequest);

    public CarResponse deleteCar(String id);

    public List<CarResponse> getCars();
}

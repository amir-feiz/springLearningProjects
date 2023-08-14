package com.example.cartest.controller;

import com.example.cartest.model.request.CarRequest;
import com.example.cartest.model.response.CarResponse;
import com.example.cartest.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/car")
@RestController
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<CarResponse> saveCar(@RequestBody CarRequest carRequest){
        return new ResponseEntity<>(carService.saveCar(carRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarResponse> getCar(@PathVariable String id){
        return new ResponseEntity<>(carService.getCar(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarResponse> updateCar(@PathVariable String id,@RequestBody CarRequest carRequest){
        return new ResponseEntity<>(carService.updateCar(id,carRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CarResponse> updateCar(@PathVariable String id){
        return new ResponseEntity<>(carService.deleteCar(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CarResponse>> getCars(){
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }
}

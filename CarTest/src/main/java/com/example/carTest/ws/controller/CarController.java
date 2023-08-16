package com.example.carTest.ws.controller;

import com.example.carTest.ws.model.request.CarRequest;
import com.example.carTest.ws.model.response.CarResponse;
import com.example.carTest.ws.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Car services", description = "Car management API")
@Controller
@AllArgsConstructor
@RequestMapping("/car")
@RestController
public class CarController {

    private final CarService carService;

    @Operation(
        tags = {"post"},
            summary = "Save car",
            description = "POST a CarEntity bode to " +
                    "this method then saves it in db",
            method = "POST"
    )
    @PostMapping
    public ResponseEntity<CarResponse> saveCar(@RequestBody CarRequest carRequest){
        return new ResponseEntity<>(carService.saveCar(carRequest), HttpStatus.CREATED);
    }

    @Operation(
            tags = {"get"},
            summary = "GET car by UUID",
            description = "GET the car by UUID from db",
            method = "GET"
    )
    @GetMapping("/{id}")
    public ResponseEntity<CarResponse> getCar(@PathVariable String id){
        return new ResponseEntity<>(carService.getCar(id), HttpStatus.OK);
    }

    @Operation(
            tags = {"put"},
            summary = "update car",
            description = "Updates a car in db with every " +
                    "field which needs to be updated - gets car entity using entity" +
                    "then should receive a CarRequest to update the car",
            method = "PUT"
    )
    @PutMapping("/{id}")
    public ResponseEntity<CarResponse> updateCar(@PathVariable String id,@RequestBody CarRequest carRequest){
        return new ResponseEntity<>(carService.updateCar(id,carRequest), HttpStatus.OK);
    }
    @Operation(
            tags = {"delete"},
            summary = "deletes a car",
            description = "deletes a car by it's id in PathVariable",
            method = "DELETE"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<CarResponse> updateCar(@PathVariable String id){
        return new ResponseEntity<>(carService.deleteCar(id), HttpStatus.OK);
    }
    @Operation(
            tags = {"get"},
            summary = "get all cars",
            description = "returns all cars from db",
            method = "GET"
    )
    @GetMapping("/all")
    public ResponseEntity<List<CarResponse>> getCars(){
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }
}

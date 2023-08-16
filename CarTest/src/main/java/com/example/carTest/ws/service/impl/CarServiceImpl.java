package com.example.carTest.ws.service.impl;

import com.example.carTest.ws.model.entity.CarEntity;
import com.example.carTest.ws.model.response.CarResponse;
import com.example.carTest.ws.repository.CarRepository;
import com.example.carTest.ws.model.request.CarRequest;
import com.example.carTest.ws.service.CarService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class CarServiceImpl implements CarService {

    private final ModelMapper modelMapper;
    private final CarRepository carRepository;

    @Override
    public CarResponse saveCar(CarRequest carRequest) {


        CarEntity carEntity = modelMapper.map(carRequest, CarEntity.class);
        carEntity.setPublicID(UUID.randomUUID().toString());
        return modelMapper.map(carRepository.save(carEntity), CarResponse.class);

    }

    @Override
    public CarResponse getCar(String id) {
        CarEntity carEntity = carRepository.findByPublicID(id);
        return modelMapper.map(carEntity, CarResponse.class);
    }

    @Override
    public CarResponse updateCar(String id, CarRequest carRequest) {
        CarEntity carEntity = carRepository.findByPublicID(id);

        if (carRequest.getName()!=null)
            carEntity.setName(carRequest.getName());
        if (carRequest.getYearOfProduct() != null)
            carEntity.setYearOfProduct(carRequest.getYearOfProduct());
        if (carRequest.getColor()!=null)
            carEntity.setColor(carRequest.getColor());

        return modelMapper.map(carRepository.save(carEntity), CarResponse.class);

    }

    @Override
    public CarResponse deleteCar(String id) {
        CarEntity carEntity = carRepository.findByPublicID(id);
        carRepository.deleteById(carEntity.getId());
        return modelMapper.map(carEntity, CarResponse.class);
    }

    @Override
    public List<CarResponse> getCars(){
        List<CarEntity> carEntities = carRepository.findAll();
        List<CarResponse> carResponses = carEntities.stream().
                map((carEntity) -> modelMapper.map(carEntity,CarResponse.class)).toList();
        return carResponses;
    }
}

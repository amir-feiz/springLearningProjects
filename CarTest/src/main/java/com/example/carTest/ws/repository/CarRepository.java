package com.example.carTest.ws.repository;
import com.example.carTest.ws.model.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long> {
    CarEntity findByPublicID(String publicId);
}

package com.example.webService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBoby;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @PostMapping("/cars")
    public void addCar(@RequestBoby Car car){
        carRepository.save(car);
    }
	
}

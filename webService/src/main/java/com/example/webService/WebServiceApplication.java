package com.example.webService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(WebServiceApplication.class, args);
		CarRepository carRepository = (CarRepository)context.getBean("carRepository");
		Car car = new Car("11AA22");
		carRepository.save(car);

	}

}

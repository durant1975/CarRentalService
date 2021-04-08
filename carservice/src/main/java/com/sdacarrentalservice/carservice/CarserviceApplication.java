package com.sdacarrentalservice.carservice;

import com.sdacarrentalservice.carservice.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarserviceApplication {
	@Autowired
	ReservationRepository reservationRepository;
	public static void main(String[] args) {
		SpringApplication.run(CarserviceApplication.class, args);
	}


}

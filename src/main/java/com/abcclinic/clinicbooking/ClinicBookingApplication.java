package com.abcclinic.clinicbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicBookingApplication.class, args);
    }

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(ClinicBookingApplication.class); }
	 */
}
package com.abcclinic.clinicbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder; // Need this import
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // Need this import

@SpringBootApplication
public class ClinicBookingApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClinicBookingApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ClinicBookingApplication.class, args);
    }
}

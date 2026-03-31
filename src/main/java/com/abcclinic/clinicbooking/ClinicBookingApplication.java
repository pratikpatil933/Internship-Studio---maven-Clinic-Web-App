package com.abcclinic.clinicbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ClinicBookingApplication extends SpringBootServletInitializer {

    // This method is required for WAR deployment to external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClinicBookingApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ClinicBookingApplication.class, args);
    }
}

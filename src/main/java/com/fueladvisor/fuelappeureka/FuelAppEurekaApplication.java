package com.fueladvisor.fuelappeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FuelAppEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuelAppEurekaApplication.class, args);
    }
}

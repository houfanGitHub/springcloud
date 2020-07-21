package com.example.turbineclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableTurbine
public class TurbineClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineClientApplication.class, args);
    }

}

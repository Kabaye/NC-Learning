package com.netcracker.edu.kulich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CustomerManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementApplication.class, args);
    }
}

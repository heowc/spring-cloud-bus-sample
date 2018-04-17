package com.heowc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudMileageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMileageApplication.class, args);
    }

    @Value("${info.description}")
    private String description;

    @GetMapping("/")
    public String getDescription() {
        return description;
    }
}

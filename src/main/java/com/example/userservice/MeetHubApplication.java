package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
        @PropertySource("file:${CONFIG_PATH}/application.properties"),
        @PropertySource("file:${CONFIG_PATH}/persistence.properties")
})
@SpringBootApplication
public class MeetHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetHubApplication.class, args);
    }

}

package com.example.springcognito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableResourceServer
public class SpringCognitoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCognitoApplication.class, args);
    }
}

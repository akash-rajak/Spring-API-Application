
// Creating simple Api, that will sent HTTP request and then we will get the response
// Basically we will create an API, that will sent a HTTP request from chrome to our Spring Boot Application, thereafter the application will process the request and return the response

package com.simpleAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // for the application to be a spring boot application
@RestController // for request purpose
                // this annotation make sure that any method in this class that has annotation of above Mapping, will be exposed as rest endpoints, that any client can call
public class simpleAPIApplication {
    public static void main(String[] args) {
        SpringApplication.run(simpleAPIApplication.class, args);
    }

    // creating method in main class
//    @GetMapping("/") // here "/" is a path, http://localhost:8080/, the things after 8080, is path that we give in @GetMapping
//    public String APImethod(){
//        return "Chrome sent the HTTP request to Spring Boot Application, and Application processed the request and send this response...";
//    }

    // creating method in main class - with some path also
    @GetMapping("/APIresponse") // here "/" is a path, http://localhost:8080/APIresponse, the things after 8080, is path that we give in @GetMapping
    public String APImethod(){
        return "Chrome sent the HTTP request to Spring Boot Application, and Application processed the request and send this response...";
    }
}

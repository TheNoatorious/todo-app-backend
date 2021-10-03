package com.todoapp.rest.webservices.todoappbackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {
    //GET method= helloWorld
    //URI path= "/hello-world"

    @RequestMapping(method= RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}

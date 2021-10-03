package com.todoapp.rest.webservices.todoappbackend;

import org.springframework.web.bind.annotation.*;

// Controller
@RestController
public class HelloWorldController {
    //GET method= helloWorld
    //URI path= "/hello-world"

    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    //hello-world-bean/path-variable/noaki
    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}

package com.example.simplespringappink8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path="/hello")
    public String hello () {
        return "hali halo";
    }

    @RequestMapping(method = RequestMethod.GET, path="/resource")
    public String resource () {
        return "{Project-A: ResourceA.1,ResourceA.2}";
    }
}

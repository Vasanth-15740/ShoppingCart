package com.SocialPlatorm.demo.Controller;

import Service.ServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDetails {
    @Autowired
    ServiceDetails serviceDetails;

    @GetMapping("/home")
    public String index() {
        return "Hello World";
    }

}

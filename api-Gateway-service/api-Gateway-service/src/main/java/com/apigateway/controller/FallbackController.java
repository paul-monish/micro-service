package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/user-service-fallback")
    public String userServiceFallback(){
        return "user service down at this time";
    }
    @GetMapping("/contact-service-fallback")
    public String contactServiceFallback(){
        return "contact service down at this time";
    }
}

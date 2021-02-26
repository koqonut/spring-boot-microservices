package com.kn.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {


    @GetMapping("/customerServiceFallBack")
    public String customerServiceFallBackMethod(){
        return  "CUSTOMER-SUPPORT is down! Inconvenience is regretted";
    }

    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBackMethod(){
        return  "ORDER-SERVICE is down! Inconvenience is regretted";
    }
}

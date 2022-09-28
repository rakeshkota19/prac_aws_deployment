package com.vikkyraki.prac_aws_deployment.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeServiceController {

    @GetMapping("health-check")
    public String healthCheck() {
        return "health-check";
    }
}

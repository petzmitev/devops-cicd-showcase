package com.petermitev.showcase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "DevOps CI/CD Showcase is running successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy.";
    }

}

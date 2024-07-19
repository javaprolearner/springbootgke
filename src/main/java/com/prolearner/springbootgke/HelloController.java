package com.prolearner.springbootgke;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello Google cloud user! Have a Good day";
    }


    @PostMapping("/postMessages")
    public String postMessage() {
        return "Hello Google cloud user! Have a Good day";
    }
}

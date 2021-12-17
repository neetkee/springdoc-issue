package com.neetkee.springdocissue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public void printHello() {
        System.out.println("Hello");
    }
}

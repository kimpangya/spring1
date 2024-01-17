package com.sparta.spring1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //http요청 중 get요청
    @GetMapping("/api/hello")
    public String hello(){
        return "Hello World!";
    }
}

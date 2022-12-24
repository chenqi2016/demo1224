package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

    @GetMapping("/test")
    String test() {
        return "ok";
    }

}

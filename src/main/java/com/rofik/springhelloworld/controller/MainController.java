package com.rofik.springhelloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<Object> hello() {
        return ResponseEntity.ok("Hello from Docker!");
    }
    
}

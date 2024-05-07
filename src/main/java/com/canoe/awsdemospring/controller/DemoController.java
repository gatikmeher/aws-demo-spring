package com.canoe.awsdemospring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("/v1")
    public ResponseEntity<Object> getDemo() {
        return ResponseEntity.ok("Hello World");
    }

}

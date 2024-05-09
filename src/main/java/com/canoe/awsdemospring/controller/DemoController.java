package com.canoe.awsdemospring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class DemoController {


    @RequestMapping("/demo")
    public ResponseEntity<Object> getDemo() {
        return ResponseEntity.ok("Hello World");
    }

    @RequestMapping("/demo1")
    public ResponseEntity<Object> getUser() {
        Map<String, String> users = Map.of("name", "John", "age", "25");
        return ResponseEntity.ok(users);
    }

}

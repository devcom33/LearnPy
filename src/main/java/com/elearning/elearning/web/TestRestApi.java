package com.elearning.elearning.web;


import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestApi {
    @GetMapping("/test")
    
    public Map<String, Object> dataTest(){
        return Map.of("Hey Mouad", "The World");
    }
}

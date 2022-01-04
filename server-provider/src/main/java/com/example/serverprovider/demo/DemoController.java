package com.example.serverprovider.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/first")
@RestController
public class DemoController {
    @Value("${server.port}")
    private String port;


    @PostMapping("/myDemo")
    public String demo(){
        return port;
    }
}

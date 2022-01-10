package com.example.configclient.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class DemoController {
//    @Value("${springcloud.hello}")
//    private String hello;

    @PostMapping("/hello")
    public String from() {
        return "hello";
    }

}

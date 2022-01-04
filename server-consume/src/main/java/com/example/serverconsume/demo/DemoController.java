package com.example.serverconsume.demo;

import com.example.serverconsume.remote.RestDemoController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/test")
@RestController
public class DemoController {
    @Autowired
    RestDemoController restDemoController;

    @PostMapping("/fun")
    public String fun(){
        String remote = restDemoController.remote();
        log.info("------{}",remote);
        return remote;
    }
}

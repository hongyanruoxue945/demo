package com.example.serverconsume.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name= "service-provider")
public interface RestDemoController {

    @PostMapping(value = "/provider/first/myDemo")
    String remote();
}

package com.example.serverconsume.remote;

import com.example.serverconsume.remote.fallback.RemoteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name= "service-provider",fallback= RemoteFallback.class)
public interface RestDemoController {

    @PostMapping(value = "/provider/first/myDemo")
    String remote();
}

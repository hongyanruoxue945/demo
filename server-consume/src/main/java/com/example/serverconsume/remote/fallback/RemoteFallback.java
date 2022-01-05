package com.example.serverconsume.remote.fallback;

import com.example.serverconsume.remote.RestDemoController;
import org.springframework.stereotype.Component;

@Component
public  class RemoteFallback implements RestDemoController {
    @Override
    public String remote() {
        return "熔断了";
    }
}

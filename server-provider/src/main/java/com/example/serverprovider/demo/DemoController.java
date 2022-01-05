package com.example.serverprovider.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.serverprovider.entity.UserEntity;
import com.example.serverprovider.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/first")
@RestController
public class DemoController {
    @Value("${server.port}")
    private String port;

    @Resource
    DemoMapper demoMapper;


    @PostMapping("/myDemo")
    public String demo(@RequestBody UserEntity user){
        UserEntity userInfo = demoMapper.getUserInfo(user);
        String result = JSONObject.toJSONString(userInfo);
        return result;
    }
}

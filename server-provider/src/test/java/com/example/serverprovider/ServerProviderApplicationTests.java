package com.example.serverprovider;

import com.alibaba.fastjson.JSONObject;
import com.example.serverprovider.entity.UserEntity;
import com.example.serverprovider.mapper.DemoMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


// 测试启动
@RunWith(SpringJUnit4ClassRunner.class)
// 加载配置文件
@TestPropertySource("classpath:test.properties")
// 加载上下文
@SpringBootTest(classes = ServerProviderApplication.class)
class ServerProviderApplicationTests {

    @Resource
    RedisTemplate redisTemplate;

    @Resource
    DemoMapper demoMapper;

    @Test
    void contextLoads() {
        UserEntity user = new UserEntity();
        user.setId("1");
        UserEntity userInfo = demoMapper.getUserInfo(user);
        String result = JSONObject.toJSONString(userInfo);
        System.out.println(result);
    }

    @Test
    void contextLoads1() {
        redisTemplate.opsForValue().set("chen","gang",10);
        Object chen = redisTemplate.opsForValue().get("chen");
        System.out.println(chen.toString());
    }

}

package com.anjia.gateway.web.rest;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestResource {
    private static final String OK="ok";

    @GetMapping("ping")
    public String ping(){
        return OK;
    }

    @GetMapping("echo")
    public String echo(@RequestParam String str){
        return str;
    }

    @GetMapping("random-sleep")
    public String random_sleep(@RequestParam String str) throws InterruptedException {
        Thread.sleep(RandomUtils.nextInt(100, 10000));
        return str;
    }
}

package com.lhfeiyu.tech.im.controller.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FeignProviderDemoController {

    @GetMapping("/feign/provider/demo")
    public String feign_provider_demo(@RequestParam(value = "param") String param) {
        return "feign_provider_demo received: " + param + "\n" + new Date().toString();
    }

}

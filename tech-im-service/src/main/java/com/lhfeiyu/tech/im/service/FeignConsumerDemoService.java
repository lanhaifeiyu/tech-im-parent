package com.lhfeiyu.tech.im.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: xujin
 **/
//@FeignClient(name = "TECH-IM-PROVIDER")
@FeignClient(name = "tech-blog-provider", url = "localhost:8888")
public interface FeignConsumerDemoService {

    @GetMapping("/feign/provider/demo")
    String feign_provider_demo(@RequestParam(value = "param") String param);

    @GetMapping("/sleuth/provider/demo")
    String sleuth_provider_demo(@RequestParam(value = "name") String name);

}

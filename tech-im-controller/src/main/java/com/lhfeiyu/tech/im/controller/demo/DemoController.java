package com.lhfeiyu.tech.im.controller.demo;

import brave.propagation.ExtraFieldPropagation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @GetMapping("/index")
    public String index() {
        return "index: this is the im project";
    }

    @GetMapping("/im/index")
    public String im_index() {
        return "/im/index: this is the im project";
    }

    @GetMapping("/zuul/im/index")
    public String zuul_im_index() {
        return "/zuul/im/index: this is the im project";
    }

    @GetMapping("/feign/provider/demo")
    public String feign_provider_demo(@RequestParam(value = "param") String param) {
        return "feign_provider_demo received: " + param + "\n" + new Date().toString();
    }

    @GetMapping("/sleuth/provider/demo")
    public String sleuth_provider_demo(String name) {
        return "hello, " + name + ",SessionId is " + ExtraFieldPropagation.get("SessionId");
    }

}

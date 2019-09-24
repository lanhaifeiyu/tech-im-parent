package com.lhfeiyu.tech.im.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CloudController {

    @GetMapping("/cloud")
    public String index() {
        return "cloud.html";
    }


}

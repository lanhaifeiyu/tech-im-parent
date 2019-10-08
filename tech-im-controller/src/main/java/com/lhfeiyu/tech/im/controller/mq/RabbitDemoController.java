package com.lhfeiyu.tech.im.controller.mq;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rabbit")
public class RabbitDemoController {

    private final AmqpAdmin    amqpAdmin;
    private final AmqpTemplate amqpTemplate;

    Logger logger = LoggerFactory.getLogger(RabbitDemoController.class);

    @Autowired
    public RabbitDemoController(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
        amqpAdmin.declareQueue(new Queue("demo"));
    }

    @ResponseBody
    @GetMapping("/send")
    public JSONObject send(@RequestParam String message) {
        JSONObject json = new JSONObject();

        amqpTemplate.convertAndSend("demo", message);

        json.put("ret", 0);
        json.put("message", message);
        return json;
    }

    @RabbitListener(queues = "demo")
    public void processMessage(String content) {
        // ...
        logger.info("message:{}", content);
    }


}

package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.message;

@RestController
public class messageController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public message getCntent(@RequestBody message message) {

        try{
            // processing -- database connectivity, etc
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        return message;
    }
}

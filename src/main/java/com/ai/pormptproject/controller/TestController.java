package com.ai.pormptproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/cc")
    public String text1(){
        return "成功访问";
    }
}

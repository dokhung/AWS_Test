package com.ohgiraffers.demoelasticbeanstalk.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class menuController {

    @PostMapping
    public void post(){
        System.out.println("yes");
    }
}

package com.ohgiraffers.chap04exceptionhandlerpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/main")
    public String Main(){

        return "main";
    }
}

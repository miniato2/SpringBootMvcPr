package com.ohgiraffers.chap01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("nick")
public class MainController {


    @PostMapping("/main")
    public String Main(@RequestParam String nick, Model model) {

        model.addAttribute("nick", nick);

        return "main";
    }
}

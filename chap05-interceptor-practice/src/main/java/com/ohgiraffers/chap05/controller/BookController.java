package com.ohgiraffers.chap05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping("")
    public String list(Model model){
        return "book/list";
    }

    @GetMapping("/{bookCode}")
    public String detail(@PathVariable String bookCode, Model model){

        model.addAttribute("bookCode", bookCode);

        return "book/detail";
    }

}

package com.ohgiraffers.chap04exceptionhandlerpractice.controller;

import com.ohgiraffers.chap04exceptionhandlerpractice.exception.InvalidCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


    @PostMapping("/login")
    public String goMain(String id, String pw) throws InvalidCredentialsException {

        if(!(id.equals("user01") && pw.equals("pass01"))){
            throw new InvalidCredentialsException("유효한 자격 증명 없음");
        }else{
            return "redirect:/main";
        }
    }
}

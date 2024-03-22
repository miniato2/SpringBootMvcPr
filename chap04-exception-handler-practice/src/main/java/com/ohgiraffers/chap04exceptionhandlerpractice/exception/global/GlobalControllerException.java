package com.ohgiraffers.chap04exceptionhandlerpractice.exception.global;

import com.ohgiraffers.chap04exceptionhandlerpractice.exception.InvalidCredentialsException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerException {

    @ExceptionHandler(InvalidCredentialsException.class)
    public String InvalidCredentialsException(Model model, InvalidCredentialsException e){

        model.addAttribute("exception", e.getMessage());

        return "error/401";
    }
}

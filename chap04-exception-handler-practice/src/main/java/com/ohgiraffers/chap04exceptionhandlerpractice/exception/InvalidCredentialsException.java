package com.ohgiraffers.chap04exceptionhandlerpractice.exception;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String msg){
        super(msg);
    }
}

package com.ohgiraffers.chap05.interceptor;

import com.ohgiraffers.chap05.controller.BookController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
@Component
public class LoggingInterceptor implements HandlerInterceptor {

    private final BookController bookController;

    public LoggingInterceptor(BookController bookController){
        this.bookController = bookController;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("[preHandle]" + "[" + request.getMethod() + "]" + request.getRequestURI());
        return true;
    }
}

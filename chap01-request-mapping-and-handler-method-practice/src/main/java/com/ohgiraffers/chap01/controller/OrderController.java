package com.ohgiraffers.chap01.controller;

import com.ohgiraffers.chap01.dto.OrderDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class OrderController {

    @PostMapping("/orders")
    public String registOrder(@ModelAttribute OrderDTO order, Model model, HttpSession session){

        String nick = (String) session.getAttribute("nick");
        order.setOrderDt(new java.util.Date(System.currentTimeMillis()));

        model.addAttribute(order);
        model.addAttribute(nick);

        return "confirm";
    }

}

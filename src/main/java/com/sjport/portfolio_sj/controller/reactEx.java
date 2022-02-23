package com.sjport.portfolio_sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reactEx {

    @RequestMapping("/")
    public String react() {
        return "hello world";
    }
}
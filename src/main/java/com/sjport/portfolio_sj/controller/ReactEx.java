package com.sjport.portfolio_sj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactEx {

    @RequestMapping("/")
    public String react() {
        return "hello world";
    }
}
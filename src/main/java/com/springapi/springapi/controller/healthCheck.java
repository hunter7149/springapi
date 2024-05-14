package com.springapi.springapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/dev")
public class healthCheck {
    @PostMapping("/check")
    public String heatlthCheck(){
        return "OK";
    }
}

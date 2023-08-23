package com.TimerApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeContoller {

    @RequestMapping("/")
    public String getHome(){

        return "index.html";
    }
}

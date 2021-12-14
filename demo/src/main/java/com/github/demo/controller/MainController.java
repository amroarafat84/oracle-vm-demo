package com.github.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {


    @GetMapping
    public String get(){
        return "Success!!!";
    }

    @GetMapping("/self")
    public String get1(){
        return "Failed!!!!!";
    }
}

package com.sorealutility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index(){

        return "index.html";
    }

    @GetMapping("/translateV1")
    public String translateV1(){

        return "translateV1.html";
    }


}

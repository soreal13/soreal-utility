package com.sorealutility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index(){

        return "index.html";
    }

    @GetMapping("/convert/v1")
    public String convertV1() {

        return "convert/convertV1.html";
    }

    @GetMapping("/convert/v2")
    public String convertV2() {

        return "convert/convertV2.html";
    }

    @GetMapping("/convert/v3")
    public String convertV3() {

        return "convert/convertV3.html";
    }

    @GetMapping("/translate/v1")
    public String translateV1(){

        return "translate/translateV1.html";
    }


}

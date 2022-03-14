package com.sorealutility.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final Logger logger = LoggerFactory.getLogger("CustomizeController ");

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

    @GetMapping("/convert/v4")
    public String convertV4() {

        return "convert/convertV4.html";
    }

    @GetMapping("/convert/v5")
    public String convertV5() {

        return "convert/convertV5.html";
    }

    @GetMapping("/convert/pre")
    public String convertPre() {

        return "convert/convertPre.html";
    }

    @GetMapping("/translate")
    public String translate(){

        return "translate/translateHome.html";
    }

    @GetMapping("/translate/v1")
    public String translateV1(){

        return "translate/translateV1.html";
    }

    @GetMapping("/translate/v2")
    public String translateV2(){

        return "translate/translateV2.html";
    }

    @GetMapping("/mydic/v1")
    public String myDicV1(){

        return "customize/myDicV1.html";
    }

    @GetMapping("/mydic/v2")
    public String myDicV2(){

        return "customize/myDicV2.html";
    }

    @GetMapping("/curl")
    public String curl(){

        return "customize/curl.html";
    }


}

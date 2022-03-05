package com.sorealutility.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/translate")
public class TranslateController {

    @RequestMapping("papapgo/v1")
    public void papagoV1 (@RequestParam String text) {

    }

}

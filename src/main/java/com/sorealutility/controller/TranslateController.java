package com.sorealutility.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sorealutility.model.TranslateV1;
import com.sorealutility.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;


@RestController
@RequestMapping("/translate")
public class TranslateController {

    @Autowired
    private TranslateService translateService;

    @Autowired
    ObjectMapper mapper = new ObjectMapper();

    @RequestMapping("papago/v1")
    public void papagoV1 (@RequestBody TranslateV1 translateV1)
            throws UnsupportedEncodingException, JsonProcessingException {

      translateService.papagoV1(translateV1);

    }

}

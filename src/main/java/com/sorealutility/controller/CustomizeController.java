package com.sorealutility.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sorealutility.model.MyDicV1;
import com.sorealutility.service.CustomizeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/customize")
public class CustomizeController {


    @Autowired
    private CustomizeService customizeService;

    private final Logger logger = LoggerFactory.getLogger("CustomizeController: ");


    @PostMapping("/mydic/v1")
    public void myDicV1 (@RequestBody MyDicV1 myDicV1) {

        customizeService.saveAsTxt(myDicV1);

    }

    @PostMapping("/curl")
    public void curl (@RequestBody String jsonString) {

        ObjectMapper mapper = new ObjectMapper();

        ArrayList<ArrayList<String>> address = null;
        try {
            address = mapper.readValue(jsonString, ArrayList.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println("stop");
        customizeService.moveFile(address);
    }

    @RequestMapping("encode/v1")
    public void encodingV1 () {

        customizeService.encodeFile();
    }


}

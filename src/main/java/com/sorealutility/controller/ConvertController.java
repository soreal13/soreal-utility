package com.sorealutility.controller;


import com.sorealutility.model.ConvertV1;
import com.sorealutility.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/convert")
public class ConvertController {

    @Autowired
    private ConvertService convertService;


    @PostMapping("/v4")
    public void convertV4 (@RequestBody ConvertV1 convertV1) {

        convertService.saveTxtFile(convertV1);
    }

    @PostMapping("/name")
    public void convertName (@RequestBody ConvertV1 convertV1){

        convertService.saveTxtFile(convertV1);
    }


}

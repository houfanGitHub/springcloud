package com.example.feignclient.controller;

import com.example.feignclient.service.EurekaClientService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Autowired
    private EurekaClientService eurekaClientService;

    @GetMapping("/index")
    public String index(){
        return eurekaClientService.indexMessage();
    }
}

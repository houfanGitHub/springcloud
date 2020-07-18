package com.example.eurekaclient.contorller;

import com.example.eurekaclient.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/index")
    public String index(){
        return indexService.getMesasge();
    }
}

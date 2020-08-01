package com.example.eurekaclient.contorller;

import com.example.eurekaclient.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {

    @Autowired
    private IndexService indexService;

    @Value("${message}")
    private String message;

    @GetMapping("/index")
    public String index(){
        return indexService.getMesasge();
    }

    @RequestMapping("/message")
    public String message(){
        return message;
    }
}

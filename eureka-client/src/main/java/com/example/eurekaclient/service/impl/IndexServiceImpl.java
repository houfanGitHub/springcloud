package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

    @Override
    public String getMesasge() {
        int number = 1/0;
        return "hello springcloud 8763";
    }
}

package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

    @Override
    public String getMesasge() {
        return "hello springcloud 8762";
    }
}

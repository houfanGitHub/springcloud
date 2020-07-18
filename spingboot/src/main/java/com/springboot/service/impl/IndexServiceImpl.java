package com.springboot.service.impl;

import com.springboot.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String getMesasge() {
        return "hello springboot";
    }
}

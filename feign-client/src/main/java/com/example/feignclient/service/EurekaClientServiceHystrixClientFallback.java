package com.example.feignclient.service;

import org.springframework.stereotype.Component;

@Component
public class EurekaClientServiceHystrixClientFallback implements EurekaClientService {
    @Override
    public String indexMessage() {
        return "服务异常，自动降级处理";
    }
}

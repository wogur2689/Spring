package com.example.iocspring;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component //스프링에서 알아서 관리.
public class Base64Encoder implements IEncoder{

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}

package com.company.ioc;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder; //Url인코딩
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}

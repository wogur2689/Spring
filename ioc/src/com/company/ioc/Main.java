package com.company.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?padge=10&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new Base64Encoder()); //외부에서 주입을 하는것 (DI)
        String result = encoder.encode(url);
        System.out.println(result);
    }
}

package com.example.abcmysql.controller;

import com.example.abcmysql.dto.Abc;
import com.example.abcmysql.service.AbcService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class AbcController {

    private final AbcService abcService;

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @PostMapping("/result")
    public String result(Abc abc) throws IOException {
        abcService.saveData(abc);
        abcService.send();
        return "result.html";
    }
}

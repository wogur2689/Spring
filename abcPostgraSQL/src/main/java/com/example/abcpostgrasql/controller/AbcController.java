package com.example.abcpostgrasql.controller;

import com.example.abcpostgrasql.dto.Abc;
import com.example.abcpostgrasql.service.AbcService;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class AbcController {

    private final AbcService abcService;

    @GetMapping("/index")
    public String home() {
        return "index.html";
    }

    @PostMapping("data")
    public void dataResponse(@RequestBody String abcMysql) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject)jsonParser.parse(abcMysql);
        Abc abc = new Abc();
        abc.setId(Long.valueOf(String.valueOf(jsonObject.get("id"))));
        abc.setName(String.valueOf(jsonObject.get("name")));
        abc.setPassword(String.valueOf(jsonObject.get("password")));
        abcService.saveData(abc);
    }

    @GetMapping("/dataweb")
    public String result(Model model) {
        model.addAttribute("abc",abcService.findData());
        return "dataweb.html";
    }
}

package com.example.springvalidation.controller;

import com.example.springvalidation.param.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class ValidationController {

    @PostMapping("/api/vaild")
    public String vaildSample(@RequestBody @Valid Food food, BindingResult result) {
        if(result.hasErrors()) {
            log.error("{}, 검증 오류", result.getTarget());
            return "주문 실패";
        }
        
        log.info("음식명 : {}", food.getFoodName());
        log.info("음식가격 : {}", food.getFoodAmount());
        log.info("음식갯수 : {}", food.getFoodCount());
        
        return "주문 완료!";
    }
    /**
     * 요청 파라미터
     * {
     *   "food_name":"떡볶이",
     *   "food_amount":3000,
     *   "food_count":2
     * }     */
}

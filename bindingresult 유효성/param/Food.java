package com.example.springvalidation.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class Food {
    @JsonProperty("food_name")
    @NotBlank(message = "음식명을 입력하세요")
    private String foodName; //음식명

    @JsonProperty("food_amount")
    @NotNull(message = "음식가격을 입력하세요")
    private int foodAmount; //음식가격

    @JsonProperty("food_count")
    @NotNull(message = "음식갯수를 입력하세요")
    private int foodCount; //음식갯수
}

package com.example.study.controller;

import com.example.study.wishlist.dto.WishListDto;
import com.example.study.wishlist.service.WishListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    //위시리스트 검색
    @GetMapping("/search")
    public WishListDto search(@RequestParam String query) {
        return wishListService.search(query);
    }

    //위시리스트 추가
    @PostMapping("")
    public WishListDto add(@RequestBody WishListDto wishListDto) {
        log.info("{}", wishListDto);
        return wishListService.add(wishListDto);
    }

    //위시리스트 전체조회
    @GetMapping("/all")
    public List<WishListDto> findAll() {
        return wishListService.findAll();
    }

    //위시리스트 삭제
    @DeleteMapping("/{index}")
    public void delete(@PathVariable int index) {
        wishListService.delete(index);
    }

    //위시리스트 방문여부
    @PostMapping("/{index}")
    public void addVisit(@PathVariable int index) {
        wishListService.addVisit(index);
    }
}

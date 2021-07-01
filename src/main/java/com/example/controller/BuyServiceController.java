package com.example.controller;

import com.example.mapper.BuyServiceMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/buyService")
public class BuyServiceController {
    @Resource
    BuyServiceMapper buyServiceMapper;
    @GetMapping
    public Integer findSale(){
        return buyServiceMapper.findSales();
    }
}

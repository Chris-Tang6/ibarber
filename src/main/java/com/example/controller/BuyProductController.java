package com.example.controller;

import com.example.mapper.BuyProductMapper;
import com.example.mapper.BuyServiceMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/buyProduct")
public class BuyProductController {
    @Resource
    BuyProductMapper buyProductMapper;

    @Resource
    BuyServiceMapper buyServiceMapper;

    @GetMapping
    public Integer findSale(){
        return buyProductMapper.findSale();
    }

    @GetMapping("/sale")
    public Map<String,Integer> getSale(){
        Map<String,Integer> map = new HashMap<>();
        Integer i=buyProductMapper.findSale()+buyServiceMapper.findSales();
        map.put("sale",i);
        return map;
    }

}

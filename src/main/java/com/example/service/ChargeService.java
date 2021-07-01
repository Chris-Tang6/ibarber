package com.example.service;

import com.example.entity.Charge;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.ChargeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChargeService extends ServiceImpl<ChargeMapper, Charge> {

    @Resource
    private ChargeMapper chargeMapper;

}
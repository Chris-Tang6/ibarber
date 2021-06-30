package com.example.service;

import com.example.entity.VIP;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.VIPMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VIPService extends ServiceImpl<VIPMapper, VIP> {

    @Resource
    private VIPMapper vIPMapper;

}
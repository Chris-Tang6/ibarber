package com.example.controller;

import com.example.common.Result;
import com.example.entity.MyService;
import com.example.service.ServiceService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Resource
     private ServiceService serviceService;

    @PostMapping
    public Result<?> save(@RequestBody MyService service) {
        return Result.success(serviceService.save(service));
    }

    @PutMapping
    public Result<?> update(@RequestBody MyService service) {
        return Result.success(serviceService.updateById(service));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        serviceService.removeById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<MyService> findById(@PathVariable Long id) {
        return Result.success(serviceService.getById(id));
    }

    @GetMapping
    public Result<List<MyService>> findAll() {
        return Result.success(serviceService.list());
    }

    @GetMapping("/page")
    public Result<IPage<MyService>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                           @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(serviceService.page(new Page<>(pageNum, pageSize), Wrappers.<MyService>lambdaQuery().like(MyService::getName, name)));
    }

}
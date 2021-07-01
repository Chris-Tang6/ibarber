package com.example.controller;

import com.example.common.Result;
import com.example.entity.Charge;
import com.example.service.ChargeService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/charge")
public class ChargeController {
    @Resource
     private ChargeService chargeService;

    @PostMapping
    public Result<?> save(@RequestBody Charge charge) {
        return Result.success(chargeService.save(charge));
    }

    @PutMapping
    public Result<?> update(@RequestBody Charge charge) {
        return Result.success(chargeService.updateById(charge));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        chargeService.removeById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Charge> findById(@PathVariable Long id) {
        return Result.success(chargeService.getById(id));
    }

    @GetMapping
    public Result<List<Charge>> findAll() {
        return Result.success(chargeService.list());
    }

    @GetMapping("/page")
    public Result<IPage<Charge>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                           @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(chargeService.page(new Page<>(pageNum, pageSize), Wrappers.<Charge>lambdaQuery().like(Charge::getUname, name)));
    }

}
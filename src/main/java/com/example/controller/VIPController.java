package com.example.controller;

import com.example.common.Result;
import com.example.entity.VIP;
import com.example.service.VIPService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/vIP")
public class VIPController {
    @Resource
     private VIPService vIPService;

    @PostMapping
    public Result<?> save(@RequestBody VIP vIP) {
        return Result.success(vIPService.save(vIP));
    }

    @PutMapping
    public Result<?> update(@RequestBody VIP vIP) {
        return Result.success(vIPService.updateById(vIP));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        vIPService.removeById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<VIP> findById(@PathVariable Long id) {
        return Result.success(vIPService.getById(id));
    }

    @GetMapping
    public Result<List<VIP>> findAll() {
        return Result.success(vIPService.list());
    }

    @GetMapping("/page")
    public Result<IPage<VIP>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                           @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(vIPService.page(new Page<>(pageNum, pageSize), Wrappers.<VIP>lambdaQuery().like(VIP::getName, name)));
    }

}
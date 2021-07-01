package com.example.controller;

import com.example.common.Result;
import com.example.entity.Staff;
import com.example.service.StaffService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Resource
     private StaffService staffService;

    @PostMapping
    public Result<?> save(@RequestBody Staff staff) {
        return Result.success(staffService.save(staff));
    }

    @PutMapping
    public Result<?> update(@RequestBody Staff staff) {
        return Result.success(staffService.updateById(staff));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        staffService.removeById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Staff> findById(@PathVariable Long id) {
        return Result.success(staffService.getById(id));
    }

    @GetMapping
    public Result<List<Staff>> findAll() {
        return Result.success(staffService.list());
    }

    @GetMapping("/page")
    public Result<IPage<Staff>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                           @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(staffService.page(new Page<>(pageNum, pageSize), Wrappers.<Staff>lambdaQuery().like(Staff::getName, name)));
    }

}
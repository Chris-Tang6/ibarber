package com.example.controller;

import com.example.common.Result;
import com.example.entity.Product;
import com.example.service.ProductService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
     private ProductService productService;

    @PostMapping
    public Result<?> save(@RequestBody Product product) {
        return Result.success(productService.save(product));
    }

    @PutMapping
    public Result<?> update(@RequestBody Product product) {
        return Result.success(productService.updateById(product));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        productService.removeById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Product> findById(@PathVariable Long id) {
        return Result.success(productService.getById(id));
    }

    @GetMapping
    public Result<List<Product>> findAll() {
        return Result.success(productService.list());
    }

    @GetMapping("/page")
    public Result<IPage<Product>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                           @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(productService.page(new Page<>(pageNum, pageSize), Wrappers.<Product>lambdaQuery().like(Product::getName, name)));
    }

}
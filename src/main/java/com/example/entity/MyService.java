package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;


@TableName("service")
public class MyService extends Model<MyService> {
    /**
      * 主键
      */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
      * 名称 
      */
    private String name;

    /**
      * 价格 
      */
    private Integer price;

    /**
      * 介绍 
      */
    private String hint;

    /**
      * 积点 
      */
    private Integer point;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
         this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
         this.price = price;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
         this.hint = hint;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
         this.point = point;
    }

}
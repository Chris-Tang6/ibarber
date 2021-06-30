package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;


@TableName("vip")
public class VIP extends Model<VIP> {
    /**
      * 主键
      */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
      * 姓名 
      */
    private String name;

    /**
      * 性别 
      */
    private Integer gender;

    /**
      * 电话号码 
      */
    private String number;

    /**
      * 钱包 
      */
    private Integer wallet;

    /**
      * 积分 
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
         this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
         this.number = number;
    }

    public Integer getWallet() {
        return wallet;
    }

    public void setWallet(Integer wallet) {
         this.wallet = wallet;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
         this.point = point;
    }

}
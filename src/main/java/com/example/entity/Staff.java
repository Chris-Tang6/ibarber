package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;


@TableName("staff")
public class Staff extends Model<Staff> {
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
      * 电话 
      */
    private String number;

    /**
      * 等级 
      */
    private Integer status;

    private String pwd;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
         this.status = status;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
         this.pwd = pwd;
    }

}
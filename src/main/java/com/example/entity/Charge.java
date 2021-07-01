package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

@TableName("charge")
public class Charge extends Model<Charge> {
    /**
      * 主键
      */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
      * 充值金额 
      */
    private Integer money;

    /**
      * 时间 
      */
    private Date time;

    /**
      * 用户ID 
      */
    private Integer vid;

    /**
      * 姓名 
      */
    private String uname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
         this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
         this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
         this.time = time;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
         this.vid = vid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
         this.uname = uname;
    }

}
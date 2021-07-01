package com.example.mapper;

import com.example.entity.Charge;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

public interface ChargeMapper extends BaseMapper<Charge> {
    @Select("SELECT SUM(p.price) FROM buyproduct bp, product p WHERE bp.p_id=p.id;")
    Integer findSales();
}
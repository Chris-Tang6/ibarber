package com.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface BuyProductMapper {
    @Select("SELECT SUM(p.price) FROM buyproduct bp, product p WHERE bp.p_id=p.id;")
    Integer findSale();
}

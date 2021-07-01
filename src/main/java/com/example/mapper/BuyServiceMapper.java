package com.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface BuyServiceMapper {
    @Select("SELECT SUM(s.price) FROM buyservice bs, service s WHERE bs.s_id=s.id;")
    Integer findSales();
}

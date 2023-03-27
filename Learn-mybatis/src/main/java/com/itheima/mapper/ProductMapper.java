package com.itheima.mapper;

import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
    @Select("select * from tb_product where id in (" +
            "select product_id from tb_ordersitem where orders_id=#{id}")
}

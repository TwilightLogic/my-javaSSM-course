package com.itheima.mapper;

import com.itheima.pojo.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {
    @Select("select * from tb_orders where user_id=#{id}")
    List<Orders> selectOrdersByUserId(int user_id);
}

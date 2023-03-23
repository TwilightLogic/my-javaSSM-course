package com.itheima.mapper;

import com.itheima.pojo.IdCard;
import org.apache.ibatis.annotations.Select;

// 为了学习注解的关联查询
public interface IdCardMapper {
    @Select("select * from tb_card where id=#{id}")
    IdCard selectIdCardById(int id);
}

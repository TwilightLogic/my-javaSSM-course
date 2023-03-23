package com.itheima.mapper;

import com.itheima.pojo.IdCard;
import com.itheima.pojo.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    @Select("select * from tb_person where id=#{id}")
    @Results({
            @Result(
                    // 根据card_id这个字段来查询tb_card中的数据
                    column = "card_id",
                    property = "card",
                    javaType = IdCard.class,
                    one = @One(select = "com.itheima.mapper.IdCardMapper.selectIdCardById"))
    })
    Person selectPersonById(int id);
}

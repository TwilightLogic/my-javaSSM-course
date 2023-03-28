package com.example.dao;

import com.example.entity.Class;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassMapper {
    @Select("SELECT * FROM c_class WHERE id=#{id}")
    @Results({@Result(id = true, column = "id", property = "id"),
        @Result(column = "id", property = "studentList",
            many = @Many(select = "com.example.dao.StudentMapper.selectByCid"))})
    Class selectClassById(int id);
}

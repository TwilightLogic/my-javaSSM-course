package com.example.dao;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    @Select("SELECT * FROM s_student WHERE id=#{id}")
    Student selectById(int id);

    @Update("UPDATE s_student SET name=#{name}, age=#{age} WHERE id=#{id}")
    int updateStudent(Student student);

    @Select("SELECT * FROM s_student WHERE cid=#{cid}")
    List<Student> selectByCid(int cid);
}

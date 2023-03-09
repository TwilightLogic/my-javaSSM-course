package com.example.mapper;

import com.example.entity.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentsMapper {
    List<Students> findStudentsByNameAndMajor(Students students);

    List<Students> findStudentsListById(List<Integer> ids);
}

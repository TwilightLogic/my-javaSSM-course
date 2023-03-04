package com.example.mapper;

import com.example.entity.Staff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StaffMapper {
    // 1⃣️ 根据id查询员工信息
    Staff selectStaffById(int id);

    // 2⃣️ 新增员工
    int addStaff(Staff staff);

    // 3⃣️ 根据id修改员工信息
    int updateStaffById(@Param("staff") Staff staff, @Param("id") int id);

    // 4⃣️ 根据id删除员工信息
    int deleteStaffById(int id);
}

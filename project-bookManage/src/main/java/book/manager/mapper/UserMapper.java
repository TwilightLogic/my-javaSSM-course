package book.manager.mapper;

import book.manager.entity.AuthUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("select * from users where name = #{name}")
    AuthUser getPasswordByUsername(String name);

    // 这里的password要填加密后的密码，不能填"123456"（在实现类那里写）
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    @Insert("insert into users(name, role, password) values(#{name}, #{role}, #{password})")
    int registerUser(AuthUser user);

    @Insert("insert into student(uid, name, grade, sex) values(#{uid}, #{name}, #{grade}, #{sex})")
    int addStudentInfo(@Param("uid") Integer uid,
                       @Param("name") String name,
                       @Param("grade") String grade,
                       @Param("sex") String sex);

    @Select("select sid from student where uid = #{uid}")
    Integer getSidByUserId(int uid);

    @Select("select count(*) from student")
    int getStudentCount();
}

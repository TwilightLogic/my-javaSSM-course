package book.manager.mapper;

import book.manager.entity.AuthUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("select password from users where username = #{username}")
    AuthUser getPasswordByUsername(String username);

    // 这里的password要填加密后的密码，不能填"123456"（在实现类那里写）
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    @Insert("insert into users(username, role, password) values(#{username}, #{role}, #{password})")
    int registerUser(AuthUser user);

    @Insert("insert into student(uid, name, grade, sex) values(#{uid}, #{name}, #{grade}, #{sex})")
    int addStudentInfo(@Param("uid") Integer uid,
                       @Param("name") String name,
                       @Param("grade") String grade,
                       @Param("sex") String sex);
}

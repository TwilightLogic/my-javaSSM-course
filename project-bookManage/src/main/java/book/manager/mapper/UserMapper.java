package book.manager.mapper;

import book.manager.entity.AuthUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select password from users where username = #{username}")
    AuthUser getPasswordByUsername(String username);

    // 这里的password要填加密后的密码，不能填"123456"
    @Insert("insert into users(name, role, password) values(#{name}, #{role}, #{password})")
    int registerUser(@Param("name") String name,
                     @Param("role") String role,
                     @Param("password") String password);

    @Insert("insert into student(uid, name, grade, sex) values(#{uid}, #{name}, #{grade}, #{sex})")
    int addStudentInfo(@Param("uid") Integer uid,
                       @Param("name") String name,
                       @Param("grade") String grade,
                       @Param("sex") String sex);
}

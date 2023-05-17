package book.manager.mapper;

import book.manager.entity.AuthUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select password from users where username = #{username}")
    AuthUser getPasswordByUsername(String username);
}

package book.manager.service.impl;

import book.manager.entity.AuthUser;
import book.manager.mapper.UserMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAuthService implements UserDetailsService {

    @Resource
    UserMapper mapper;

    // build()方法返回一个UserDetails对象，
    // 该对象包含了从数据库中获取的用户名、密码和角色信息。
    // Spring Security将使用这些信息来进行用户认证和授权的操作。
    // 这里的 `s` 是用户名
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AuthUser user = mapper.getPasswordByUsername(s);  // 从数据库根据用户名获取密码
        if(user.getPassword() == null)
            throw new UsernameNotFoundException("登录失败，用户名或密码错误！");
        return User   // 这里需要返回UserDetails，SpringSecurity会根据给定的信息进行比对
                .withUsername(user.getName())
                .password(user.getPassword())   // 直接从数据库取的密码
                .roles(user.getRole())   // 用户角色
                .build();
    }
}

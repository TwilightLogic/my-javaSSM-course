package book.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    // 用来处理用户的登录
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  // 这里使用SpringSecurity提供的BCryptPasswordEncoder
        auth
                .inMemoryAuthentication() // 直接验证方式，之后会讲解使用数据库验证
                .passwordEncoder(encoder) // 密码加密器
                .withUser("test")   // 用户名
                .password(encoder.encode("123456"))   // 这里需要填写加密后的密码
                .roles("user");
    }
}
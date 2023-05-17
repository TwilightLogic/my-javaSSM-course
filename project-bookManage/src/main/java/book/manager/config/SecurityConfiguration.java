package book.manager.config;

import book.manager.service.UserAuthService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Resource
    UserAuthService service;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()   // 配置哪些请求会被拦截，哪些请求必须具有什么角色才能访问
                .antMatchers("/static/**").permitAll()    // 静态资源，使用permitAll来运行任何人访问
                .antMatchers("/**").hasRole("user")     // 所有请求必须登录并且是user角色才可以访问（不包含上面的静态资源）
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/doLogin")
                .defaultSuccessUrl("/index", true)
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .and()
                .csrf().disable();
    }

    // 用来处理用户的登录
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  // 这里使用SpringSecurity提供的BCryptPasswordEncoder
            auth
                    .userDetailsService(service)
                    .passwordEncoder(new BCryptPasswordEncoder());

    }
}
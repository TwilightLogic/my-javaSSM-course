package book.manager.service.impl;

import book.manager.mapper.UserMapper;
import book.manager.service.AuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AuthServiceImpl implements AuthService {

    @Resource
    UserMapper mapper;

    @Override
    public boolean register(String name, String sex, String grade, String password) {
        return false;
    }
}

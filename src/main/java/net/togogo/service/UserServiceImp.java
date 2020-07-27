package net.togogo.service;

import net.togogo.bean.User;
import net.togogo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void userAdd(User user) {
        userMapper.userAdd(user);
    }
}

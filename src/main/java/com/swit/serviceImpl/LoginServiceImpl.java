package com.swit.serviceImpl;

import com.swit.entity.User;
import com.swit.mapper.UserMapper;
import com.swit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2017/7/25 0025.
 */

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean loginCheck(User user) {
        List<User> list = userMapper.getAllUser();
        for (User u : list){
            if (user.getPhonenumber() == u.getPhonenumber() || Objects.equals(user.getPassword(), u.getPassword())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        List<User> list = userMapper.getAllUser();
        for (User u : list){
            if (user.getPhonenumber() == u.getPhonenumber() && Objects.equals(user.getUsername(), u.getUsername())){
                return false;
            }
        }
        userMapper.addUser(user);
        return true;
    }
}

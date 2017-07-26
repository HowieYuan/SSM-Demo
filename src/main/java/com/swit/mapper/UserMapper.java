package com.swit.mapper;

import com.swit.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Administrator on 2017/7/25 0025.
 */

@Repository
public interface UserMapper {

    List<User> getAllUser();

    void addUser(User user);
}

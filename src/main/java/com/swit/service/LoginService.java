package com.swit.service;

import com.swit.entity.User;

/**
 * Created by Administrator on 2017/7/25 0025.
 */

public interface LoginService {

   boolean loginCheck(User user);

   boolean register(User user);
}

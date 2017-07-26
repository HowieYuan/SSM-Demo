package com.swit.handlers;

import com.swit.entity.User;
import com.swit.service.LoginService;
import com.swit.serviceImpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.activation.CommandMap;
import javax.validation.Valid;
import java.util.Map;

/**
 * Created by 袁浩越 on 2017/7/25 0025.
 */

@Controller
public class LoginHandler {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(User user){
        boolean loginSuccess = loginService.loginCheck(user);
        if (loginSuccess){
            return "home";
        }
        else return "error";
    }

    @RequestMapping("/toRegister")
    public String toRegister(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping("/register")
    public String register(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "register";
        }
        boolean registerSuccess = loginService.register(user);
        if (registerSuccess){
            return "registerSuc";
        }
        else return "error";

    }

}

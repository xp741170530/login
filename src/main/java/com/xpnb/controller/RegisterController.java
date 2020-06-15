package com.xpnb.controller;

import com.xpnb.domain.User;
import com.xpnb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/")
    public String Register(){
        return  "register1";

    }
    @RequestMapping("/addUser")
    public  String register(HttpServletRequest request){
        String username =request.getParameter("username");
        String password = request.getParameter("password");
        String userphone = request.getParameter("userphone");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setUserphone(userphone);
        userMapper.save(user);
        return "login1";



    }
}

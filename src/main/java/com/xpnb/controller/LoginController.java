package com.xpnb.controller;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.xpnb.domain.User;
import com.xpnb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/login1")
    public String Login(){
        return  "login1";

    }
    @RequestMapping("/addLogin")
    public String addLogin(HttpServletRequest request, Model model, Map<String,Object> map){
        String username =request.getParameter("username");
        String password = request.getParameter("password");
        String userphone = request.getParameter("userphone");
        User user = userMapper.Identify(username,password);

        if (user!=null){
            model.addAttribute("user", username);
            map.put("msg","登录成功");
            return  "222";

        }
        else {
                map.put("msg","登录失败");
            return "login1";
        }
    }

}

package com.wzq.springboot_study_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Model model, HttpSession session){

        // 判断用户名密码是否正确
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else {  // 登录失败
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}

package me.app.controller;

import me.app.pojo.BackendUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomePage {


    //首页访问
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }





}

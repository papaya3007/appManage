package me.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {


    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }


}

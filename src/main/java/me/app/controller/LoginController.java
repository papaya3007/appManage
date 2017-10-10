package me.app.controller;

import me.app.pojo.BackendUser;
import me.app.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

//登陆控制器
@Controller
public class LoginController {

    private Logger logger = LogManager.getLogger(LoginController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)

}

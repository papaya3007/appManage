package me.app.controller;

import me.app.pojo.BackendUser;
import me.app.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.awt.SunHints;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.sampled.Line;

//登陆控制
@Controller
public class LoginController {
    private Logger logger = LogManager.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String dologin(@RequestParam(value = "name", required = false) String username, @RequestParam(value = "pwd", required = false) String password, HttpSession session) {


        logger.info("username" + username + "pwd" + password);
        BackendUser user = null;
        user = userService.login(username, password);
        if (user != null) {
            logger.info(user.toString());
            session.setAttribute("user",user);
            return "redirect:/index";
        } else {
            return "login";
        }

    }

    @RequestMapping(value = "/index")
    public String index(HttpSession session) {
        session.getAttribute("user");
        return "index";
    }
}

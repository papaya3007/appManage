package me.app.service;


import me.app.pojo.BackendUser;

//用户服务层
public interface UserService {

    //登陆功能，通过验证密码和用户名实现
    public BackendUser login(String username, String password);
}

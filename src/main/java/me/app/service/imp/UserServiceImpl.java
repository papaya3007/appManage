package me.app.service.imp;

import me.app.dao.BackendUserMapper;
import me.app.pojo.BackendUser;
import me.app.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
//服务层实现类
@Service("userService")
public class UserServiceImpl implements UserService{


    @Resource
    private BackendUserMapper backendUserMapper;


    @Override
    public BackendUser login(String username, String password) {
        return this.backendUserMapper.findByUsernameAndPassword(username,password);
    }
}

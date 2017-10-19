package me.app.service.imp;


import me.app.dao.AppVersionMapper;
import me.app.pojo.AppInfo;
import me.app.service.AppVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("appVersion")
public class AppVersionServiceImpl implements AppVersionService{
    @Resource
    private AppVersionMapper appVersionMapper;
    @Override
    public String version(AppInfo appInfo) {
        return this.appVersionMapper.appVersion(appInfo);
    }
}

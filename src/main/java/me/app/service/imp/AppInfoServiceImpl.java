package me.app.service.imp;

import me.app.dao.AppInfoMapper;
import me.app.pojo.AppInfo;
import me.app.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("appInfo")
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public List<AppInfo> appInfoList() {
        return this.appInfoMapper.ALLInfoList();
    }
}

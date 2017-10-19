package me.app.service.imp;

import me.app.dao.DataDictionaryMapper;
import me.app.pojo.AppInfo;
import me.app.pojo.DataDictionary;
import me.app.service.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("dateService")
public class DataServiceImpl implements DataService{
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public String appFlatform(AppInfo appInfo) {
        return this.dataDictionaryMapper.APP_FLATFORM(appInfo);
    }

    @Override
    public String appStatus(AppInfo appInfo) {
        return this.dataDictionaryMapper.AppStatus(appInfo);
    }
}

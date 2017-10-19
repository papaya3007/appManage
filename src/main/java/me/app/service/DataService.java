package me.app.service;

import me.app.pojo.AppInfo;

public interface DataService {
    public String appFlatform(AppInfo appInfo);

    public String appStatus(AppInfo appInfo);
}

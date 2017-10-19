package me.app.controller;

import javafx.scene.control.Alert;
import me.app.pojo.AppInfo;
import me.app.pojo.AppVersion;
import me.app.service.AppCategoryService;
import me.app.service.AppInfoService;
import me.app.service.AppVersionService;
import me.app.service.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

//页面跳转
@Controller
public class AppListController {
    @Resource
    private AppInfoService appInfoService;
    @Resource
    private AppCategoryService appCategoryService;
    @Resource
    private DataService dataService;
    @Resource
    private AppVersionService appVersionService;
    @RequestMapping(value = "/appTable")
    public String appTable(Model model) {
        List<AppInfo> appInfoList = appInfoService.appInfoList();
        if(appInfoList.size()>1){
            for (AppInfo appInfo : appInfoList) {
                appInfo.setLevel1Category((appCategoryService.categorySerach(appInfo.getCategorylevel1())).getCategoryname());
                appInfo.setLevel2Category((appCategoryService.categorySerach(appInfo.getCategorylevel2())).getCategoryname());
                appInfo.setLevel3Category((appCategoryService.categorySerach(appInfo.getCategorylevel3())).getCategoryname());
                appInfo.setAppFlatform(dataService.appFlatform(appInfo));
                appInfo.setAppStatus(dataService.appStatus(appInfo));
                appInfo.setVersionNo(appVersionService.version(appInfo));
            }
            model.addAttribute("appInfoDefaultList", appInfoList);

        }else{
            model.addAttribute("appInfoDefaultList", null);
        }
        return "appTable";
    }



}

package me.app.service.imp;

import me.app.dao.AppCategoryMapper;
import me.app.pojo.AppCategory;
import me.app.service.AppCategoryService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("appCategory")
public class AppCategoryServiceImpl implements AppCategoryService {

    @Resource
    private AppCategoryMapper appCategoryMapper;
    @Override
    public AppCategory categorySerach(long id) {
        return this.appCategoryMapper.selectByPrimaryKey(id);
    }
}

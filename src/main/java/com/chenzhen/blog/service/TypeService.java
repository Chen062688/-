package com.chenzhen.blog.service;

import com.chenzhen.blog.pojo.Type;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
* @author MIS
* @description 针对表【t_type】的数据库操作Service
* @createDate 2022-09-11 18:21:11
*/
public interface TypeService extends IService<Type> {

    PageInfo<Type> pageTypeList(Integer pageNum,Integer pageSize);

    List<Type> getTypeList();

}

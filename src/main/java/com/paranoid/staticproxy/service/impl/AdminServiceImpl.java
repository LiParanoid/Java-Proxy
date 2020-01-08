package com.paranoid.staticproxy.service.impl;

import com.paranoid.staticproxy.service.AdminService;

/**
 * 创建实现类 重写方法
 */
public class AdminServiceImpl implements AdminService {
    @Override
    public void update() {
        System.out.println("修改管理系统数据");
    }

    @Override
    public Object find() {
        System.out.println("查看管理系统数据");
        return new Object();
    }
}

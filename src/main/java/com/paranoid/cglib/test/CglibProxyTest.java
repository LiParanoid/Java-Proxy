package com.paranoid.cglib.test;

import com.paranoid.cglib.service.AdminCglibService;
import com.paranoid.cglib.service.AdminServiceCglibProxy;

public class CglibProxyTest {
    public static void main(String[] args) {
        AdminCglibService adminCglibService = new AdminCglibService();
        AdminCglibService proxyInstance = (AdminCglibService)(new AdminServiceCglibProxy(adminCglibService).getProxyInstance());
        proxyInstance.find();
        proxyInstance.update();
    }
}

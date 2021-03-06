package com.paranoid.staticproxy.test;

import com.paranoid.staticproxy.proxy.AdminServiceProxy;
import com.paranoid.staticproxy.service.AdminService;
import com.paranoid.staticproxy.service.impl.AdminServiceImpl;

/**
 * 测试类
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImpl();
        AdminServiceProxy adminServiceProxy = new AdminServiceProxy(adminService);
        adminServiceProxy.updata();
        adminServiceProxy.find();

        /**
         * 总结：
         * 静态代理模式在不改变目标对象的前提下，实现了对目标对象的功能扩展。
         * 不足：静态代理实现了目标对象的所有方法，一旦目标接口增加方法，代理对象和目标对象都要进行相应的修改，增加维护成本。
         */
    }
}

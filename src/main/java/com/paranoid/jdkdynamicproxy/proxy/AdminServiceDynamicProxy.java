package com.paranoid.jdkdynamicproxy.proxy;

import com.paranoid.jdkdynamicproxy.invocation.AdminServiceInvocation;

import java.lang.reflect.Proxy;

public class AdminServiceDynamicProxy {
    private Object target;
    private AdminServiceInvocation adminServiceInvocation;

    public AdminServiceDynamicProxy(Object target, AdminServiceInvocation adminServiceInvocation) {
        this.target = target;
        this.adminServiceInvocation = adminServiceInvocation;
    }

    public Object getPersonProxy(){
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),adminServiceInvocation);
        return obj;
    }
}

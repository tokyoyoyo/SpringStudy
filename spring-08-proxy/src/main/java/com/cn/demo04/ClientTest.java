package com.cn.demo04;

import com.cn.demo02.UserService;
import com.cn.demo02.UserServiceImpl;
import com.cn.demoUp.ProxyInvocationHandler;

public class ClientTest {
    public static void main(String[] args) {

        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyTest proxyTest = new ProxyTest();

        //设置要代理的角色
        proxyTest.setTarget(userService);

        UserService proxy = (UserService) proxyTest.getProxy();

        proxy.delete();


    }
}

package com.cn.demoUp;

public class ClientUp {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色，待生成
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要用到的接口对象
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}

package com.cn.demoUp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        //动态代理的本质就是反射机制
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);

    }


    public void seeHouse(){
        System.out.println("带客户看房2");
    }

    public void heTong(){
        System.out.println("签合同2");
    }

    public void getFee(){
        System.out.println("收中介费2");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();
        getFee();
        heTong();

        Object result = method.invoke(rent, args);
        return result;
    }
}
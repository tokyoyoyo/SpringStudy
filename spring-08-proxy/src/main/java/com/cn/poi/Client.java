package com.cn.poi;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介替房东租，代理会有附属操作
        ProxyZJ proxy = new ProxyZJ(host);

        proxy.rent();
        proxy.seeHouse();
        proxy.heTong();
        proxy.getFee();
    }

}

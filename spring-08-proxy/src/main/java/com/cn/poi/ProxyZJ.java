package com.cn.poi;

public class ProxyZJ implements Rent{

    private Host host;

    public ProxyZJ(Host host) {
        this.host = host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("房东有房子要租，中介帮他租");
    }

    public void seeHouse(){
        System.out.println("带客户看房");
    }

    public void heTong(){
        System.out.println("签合同");
    }

    public void getFee(){
        System.out.println("收中介费");
    }
}

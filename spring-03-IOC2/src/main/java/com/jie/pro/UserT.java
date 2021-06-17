package com.jie.pro;

public class UserT {
    private String name;

    public UserT(){
        System.out.println("UserT的无参构造");
        this.show();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("nameT="+name);
    }
}

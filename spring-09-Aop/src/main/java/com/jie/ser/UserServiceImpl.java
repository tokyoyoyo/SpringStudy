package com.jie.ser;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("yh+1");
    }

    @Override
    public void del() {
        System.out.println("yh-1");
    }

    @Override
    public void upd() {
        System.out.println("yhC1");
    }

    @Override
    public void sel() {
        System.out.println("yhA1");
    }
}

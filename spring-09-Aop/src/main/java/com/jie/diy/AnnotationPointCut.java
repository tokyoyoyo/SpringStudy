package com.jie.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect     //标注这是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.jie.ser.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* com.jie.ser.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }

//    @Around("execution(* com.jie.ser.UserServiceImpl.*(..))")
//    public void around(ProceedingJoinPoint jp) throws Throwable{
//
//        System.out.println("环绕前");
//        System.out.println("签名:"+jp.getSignature());
//            //执行目标方法proceed
//        Object proceed = jp.proceed();  //执行方法
//        System.out.println("环绕后");
//    }

}

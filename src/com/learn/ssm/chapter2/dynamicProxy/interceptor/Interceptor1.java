package com.learn.ssm.chapter2.dynamicProxy.interceptor;

import java.lang.reflect.Method;

/**
 * @ClassName Interceptor1
 * @Description zerenlianmoshi obligation-link-design pattern
 * @Author qibie
 * @Date 10/17/18 6:53 PM
 */
public class Interceptor1 implements Interceptor {

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("Interceptor1 before method");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("Interceptor1 after method");
    }
}
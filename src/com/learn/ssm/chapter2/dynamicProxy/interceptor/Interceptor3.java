package com.learn.ssm.chapter2.dynamicProxy.interceptor;

import java.lang.reflect.Method;

/**
 * @ClassName Interceptor3
 * @Description zerenlianmoshi obligation-link-design pattern
 * @Author qibie
 * @Date 10/17/18 6:53 PM
 */
public class Interceptor3 implements Interceptor {

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("Interceptor3 before method");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("Interceptor3 after method");
    }
}
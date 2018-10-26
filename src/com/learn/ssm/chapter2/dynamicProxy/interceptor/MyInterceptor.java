package com.learn.ssm.chapter2.dynamicProxy.interceptor;

import java.lang.reflect.Method;

/**
 * @ClassName MyInterceptor
 * @Description
 * @Author qibie
 * @Date 10/17/18 4:22 PM
 */
public class MyInterceptor implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("logic code before reflective method");
        // don't reflect proxy object method
        return false;
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("logic code after reflective method");
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("replace the method of proxy object");
    }
}

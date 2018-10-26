package com.learn.ssm.chapter2.dynamicProxy.interceptor;

import java.lang.reflect.Method;

/**
 * @ClassName Interceptor
 * @Description
 * @Author qibie
 * @Date 10/17/18 4:18 PM
 */
public interface Interceptor {
    boolean before(Object proxy, Object target, Method method, Object[] args);

    void around(Object proxy, Object target, Method method, Object[] args);

    void after(Object proxy, Object target, Method method, Object[] args);
}

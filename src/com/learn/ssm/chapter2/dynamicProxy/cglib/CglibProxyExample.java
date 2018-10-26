package com.learn.ssm.chapter2.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibProxyExample
 * @Description
 * @Author qibie
 * @Date 10/17/18 3:14 PM
 */
public class CglibProxyExample implements MethodInterceptor {
    /**
     * create CGLIB proxy object
     * @param cls Class
     * @return CGLIB proxy object of Class
     */
    public Object getProxy(Class cls) {
        // CGLIB enhancer object
        Enhancer enhancer = new Enhancer();
        // set enhancer type
        enhancer.setSuperclass(cls);
        // define current object as proxy logic object which require current object implements MethodInterceptor method
        enhancer.setCallback(this);
        // create and return proxy object
        return enhancer.create();
    }


    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.err.println("before invoke true object");
        // CGLIB reflection invoke true object method
        Object result = methodProxy.invokeSuper(proxy, args);
        System.err.println("after invoke true object");
        return result;
    }
}

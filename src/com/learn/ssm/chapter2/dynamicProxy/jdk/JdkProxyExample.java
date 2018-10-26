package com.learn.ssm.chapter2.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JdkProxyExample
 * @Description 3.dynamic binding and logic implement
 * @Author qibie
 * @Date 10/17/18 2:40 PM
 */
public class JdkProxyExample implements InvocationHandler {

    // true object
    private Object target = null;

    /**
     * establish relationship between proxy and true object, and return proxy object
     *
     *
     * @param target true object
     * @return proxy object
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * proxy method logic
     *
     *
     * @param proxy  proxy object
     * @param method current call method
     * @param args   current method arguments
     * @return return proxy result
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Entry proxy method");
        System.out.println("Service before call true object");
        // equals to call sayHelloWorld method
        Object obj = method.invoke(target, args);
        System.out.println("Service after call true object");
        return obj;
    }
}

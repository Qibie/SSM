package com.learn.ssm.chapter2.dynamicProxy.interceptor;

import com.learn.ssm.chapter2.dynamicProxy.jdk.HelloWorld;
import com.learn.ssm.chapter2.dynamicProxy.jdk.HelloWorldImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName InterceptorJdkProxy
 * @Description
 * @Author qibie
 * @Date 10/17/18 4:30 PM
 */
public class InterceptorJdkProxy implements InvocationHandler {

    // true object
    private Object target;
    // interceptor define name
    private String interceptorClass = null;

    public InterceptorJdkProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * bind delegate target and then return a proxy placeholder
     * @param target true object
     * @param interceptorClass
     * @return proxy object placeholder
     */
    public static Object bind(Object target, String interceptorClass) {
        // get proxy object
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InterceptorJdkProxy(target, interceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (interceptorClass == null) {
            // don't set interceptor, reflect source method
            return method.invoke(target, args);
        }
        Object result = null;
        // create interceptor by reflection
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
        // invoke before method
        if (interceptor.before(proxy, target, method, args)) {
            // reflect source object method
            result = method.invoke(target, args);
        } else {
            // return false and excute around method
            interceptor.around(proxy, target, method, args);
        }
        // invoke after method
        interceptor.after(proxy, target, method, args);
        return result;
    }

    public static void main(String[] args) {
        // interceptor test code
//        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "com.learn.ssm.chapter2.dynamicProxy.interceptor.MyInterceptor");
//        proxy.sayHelloWorld();
        // obligation-link-design pattern test code
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "com.learn.ssm.chapter2.dynamicProxy.interceptor.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(proxy1, "com.learn.ssm.chapter2.dynamicProxy.interceptor.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(proxy2, "com.learn.ssm.chapter2.dynamicProxy.interceptor.Interceptor3");
        proxy3.sayHelloWorld();
    }
}
package com.learn.ssm.chapter2.dynamicProxy.cglib;

/**
 * @ClassName TestDemo
 * @Description
 * @Author qibie
 * @Date 10/17/18 3:54 PM
 */
public class TestDemo {
    public static void testCGLIBProxy() {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("dummy");
    }

    public static void main(String[] args) {
        testCGLIBProxy();
    }
}

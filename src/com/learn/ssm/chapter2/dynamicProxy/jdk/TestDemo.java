package com.learn.ssm.chapter2.dynamicProxy.jdk;

/**
 * @ClassName TestDemo
 * @Description
 * @Author qibie
 * @Date 10/17/18 3:06 PM
 */
public class TestDemo {
    public static void main(String[] args) {
        testJdkProxy();
    }

    public static void testJdkProxy() {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }
}

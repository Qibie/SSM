package com.learn.ssm.chapter2.dynamicProxy.jdk;

/**
 * @ClassName HelloWorldImpl
 * @Description 2.implements interface
 * @Author qibie
 * @Date 10/17/18 2:53 PM
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World");
    }
}

package com.learn.ssm.chapter2.dynamicProxy.cglib;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectServiceImpl
 * @Description
 * @Author qibie
 * @Date 10/16/18 8:55 PM
 */
public class ReflectServiceImpl {
    public void sayHello(String name) {
        System.err.println("Hello " + name);
    }

    /**
     * Build object by reflection
     * @return
     */
    public static ReflectServiceImpl getInstance() {
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("com.learn.ssm.chapter2.dynamicProxy.cglib.ReflectServiceImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            ex.printStackTrace();
        }
        return object;
    }

    /**
     * Build method by reflection
     * @return
     */
    public static Object reflectMethod() {
        Object returnObj = null;
        ReflectServiceImpl target = new ReflectServiceImpl();
        try {
            Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
            returnObj = method.invoke(target, "yum");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    public static void main(String[] args) {
        ReflectServiceImpl reflectServiceImpl = getInstance();
        reflectServiceImpl.sayHello("dummy");
        ReflectServiceImpl target = (ReflectServiceImpl) reflectMethod();
        target.sayHello("");
    }
}

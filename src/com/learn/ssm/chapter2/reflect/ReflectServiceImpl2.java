package com.learn.ssm.chapter2.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectServiceImpl2
 * @Description TODO
 * @Author qibie
 * @Date 10/16/18 8:59 PM
 */
public class ReflectServiceImpl2 {
    private String name;

    public ReflectServiceImpl2(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.err.println("hello " + name);
    }

    static ReflectServiceImpl2 getInstance() {
        ReflectServiceImpl2 object = null;

        try {
            object = (ReflectServiceImpl2) Class.forName("com.learn.ssm.chapter2.reflect.ReflectServiceImpl2").getConstructor(String.class).newInstance("yum");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args) {
        ReflectServiceImpl2 reflectServiceImpl2 = getInstance();
        reflectServiceImpl2.sayHello();
    }
}

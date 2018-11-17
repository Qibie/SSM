package com.learn.ssm.chapter10.main;

import com.learn.ssm.chapter10.pojo.ComplexAssembly;
import com.learn.ssm.chapter10.pojo.UserRoleAssembly;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter10Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        ComplexAssembly complexAssembly = (ComplexAssembly) ctx.getBean("complexAssembly");
        System.out.println(complexAssembly.toString());
        UserRoleAssembly userRoleAssembly = (UserRoleAssembly) ctx.getBean("userRoleAssembly");
        System.out.println(userRoleAssembly.toString());
    }
}

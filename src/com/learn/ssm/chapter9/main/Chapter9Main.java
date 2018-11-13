package com.learn.ssm.chapter9.main;

import com.learn.ssm.chapter9.pojo.JuiceMaker2;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter9Main {
    public static void main(String[] args) throws BeansException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        JuiceMaker2 juiceMaker2 = (JuiceMaker2) ctx.getBean("juiceMaker2");
        System.out.println(juiceMaker2.makeJuice());
    }
}
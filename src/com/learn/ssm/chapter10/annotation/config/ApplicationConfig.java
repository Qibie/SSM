package com.learn.ssm.chapter10.annotation.config;

import com.learn.ssm.chapter10.annotation.pojo.Role;
import com.learn.ssm.chapter10.annotation.service.impl.RoleServiceImpl;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class})
//@ComponentScan(basePackages = {"com.learn.ssm.chapter10.annotation.pojo", "com.learn.ssm.chapter10.annotation.service"})
//@ComponentScan(basePackages = {"com.learn.ssm.chapter10.annotation.pojo", "com.ssm.learn.chapter10.annotation.service"}, basePackageClasses = {Role.class, RoleServiceImpl.class})
public class ApplicationConfig {
}

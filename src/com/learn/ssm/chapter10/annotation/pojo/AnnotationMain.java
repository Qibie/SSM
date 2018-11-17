package com.learn.ssm.chapter10.annotation.pojo;

import com.learn.ssm.chapter10.annotation.config.ApplicationConfig;
import com.learn.ssm.chapter10.annotation.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
//        Role role = context.getBean(Role.class);
//        System.err.println(role.getId());
//        ((AnnotationConfigApplicationContext) context).close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = ctx.getBean(Role.class);
        RoleService roleService = ctx.getBean(RoleService.class);
        roleService.printRoleInfo(role);
        ctx.close();
    }
}

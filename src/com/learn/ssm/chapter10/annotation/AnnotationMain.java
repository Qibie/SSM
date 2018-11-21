package com.learn.ssm.chapter10.annotation;

import com.learn.ssm.chapter10.annotation.config.ApplicationConfig;
import com.learn.ssm.chapter10.annotation.pojo.Role;
import com.learn.ssm.chapter10.annotation.service.RoleService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learn.ssm.chapter10.annotation.config.ApplicationConfig;
import com.learn.ssm.chapter10.annotation.pojo.Role;
import com.learn.ssm.chapter10.annotation.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: SSM
 * @ClassName: AnnotationMain
 * @Description:
 * @Author: qibie
 * @Date: 2018/11/21 16:35
 **/

public class AnnotationMain {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
//        Role role = context.getBean(Role.class);
//        System.err.println(role.getId());
//        ((AnnotationConfigApplicationContext) context).close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = ctx.getBean(Role.class);
//        RoleService roleService = ctx.getBean(RoleService.class);
//        roleService.printRoleInfo(role);
        RoleService2 roleService2 = ctx.getBean(RoleService2.class);
        roleService2.printRoleInfo();
        ctx.close();
    }
}

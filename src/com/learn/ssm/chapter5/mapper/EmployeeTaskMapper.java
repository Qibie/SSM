package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.EmployeeTask;

/**
 * @ClassName EmployeeTask
 * @Description
 * @Author qibie
 * @Date 10/30/18 8:47 PM
 */
public interface EmployeeTaskMapper {
    EmployeeTask getEmployeeTaskByEmpId(Long empId);
}

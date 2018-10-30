package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.Employee;

/**
 * @ClassName EmployeeMapper
 * @Description
 * @Author qibie
 * @Date 10/30/18 9:14 PM
 */
public interface EmployeeMapper {
    Employee getEmployee(Long id);
}

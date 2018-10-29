package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.Role;

import java.util.Map;

/**
 * @ClassName RoleMapper
 * @Description
 * @Author qibie
 * @Date 10/29/18 10:43 AM
 */
public interface RoleMapper {
    Role getRoleUseResultMap(long id);

    Role getRole(Role role);

    Role findRolesByMap(Map<String, Object> parameterMap);
}

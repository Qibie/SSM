package com.learn.ssm.chapter4.mapper;

import com.learn.ssm.chapter4.pojo.Role;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Description use XML way to implements mapper
 * @Author qibie
 * @Date 10/18/18 4:32 PM
 */
public interface RoleMapper {
    int insertRole(Role role);
    int deleteRole(Long id);
    int updateRole(Role role);
    Role getRole(Long id);
    List<Role> findRoles(String roleName);
}

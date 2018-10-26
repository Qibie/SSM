package com.learn.ssm.chapter4.mapper;

import com.learn.ssm.chapter4.pojo.Role;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName RoleMapper2
 * @Description use annotation implements mapper equals use XML way
 * @Author qibie
 * @Date 10/18/18 5:07 PM
 */
public interface RoleMapper2 {
    @Select("select id, role_name as roleName, note from t_role where id=#{id}")
    Role getRole(Long id);
}

package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.PageParams;
import com.learn.ssm.chapter5.pojo.Role;
import com.learn.ssm.chapter5.pojo.RoleParams;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
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

    List<Role> findRolesByAnnotation(@Param("roleName") String roleName, @Param("note") String note);

    List<Role> findRolesByBean(RoleParams roleParams);

    List<Role> findByMix(@Param("params") RoleParams roleParams, @Param("page")PageParams pageParams);

    List<Role> findByRowBounds(@Param("roleName") String roleName, @Param("note") String note, RowBounds rowBounds);
}

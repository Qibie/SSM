package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.param.PdCountRoleParams;
import com.learn.ssm.chapter5.param.PdFindRoleParams;

/**
 * @ClassName PdRoleMapper
 * @Description
 * @Author qibie
 * @Date 11/2/18 2:19 PM
 */
public interface PdRoleMapper {
    void countRole(PdCountRoleParams pdCountRoleParams);
    void findRole(PdFindRoleParams pdFindRoleParams);
}

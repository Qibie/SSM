package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.WorkCard;

/**
 * @ClassName WorkCardMapper
 * @Description
 * @Author qibie
 * @Date 10/30/18 7:56 PM
 */
public interface WorkCardMapper {
    WorkCard getWorkCardByEmpId(Long empId);
}

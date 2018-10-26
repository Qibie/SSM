package com.learn.ssm.chapter4.mapper;

import com.learn.ssm.chapter4.pojo.User;

/**
 * @ClassName UserMapper
 * @Description
 * @Author qibie
 * @Date 10/25/18 9:50 PM
 */
public interface UserMapper {
    User getUser(long id);
}
